#!/usr/bin/env python
# coding=UTF-8

import os

PROJECT_DIR = os.path.dirname(__file__)
XML_DIR = os.path.join( PROJECT_DIR, 'src/main/java/org/openestate/io/openimmo/xml' )


def cleanup( file ):
  data = None
  with open( file, 'r' ) as myfile:
    data = "\n".join(line.rstrip() for line in myfile)
  if data is None:
    print 'ERROR: Can\'t read file: %s' % file
    return

  converted_data = convert( data )
  if converted_data is None:
    #print 'unchanged: %s' % file
    return

  #with open( file + '.new.java', 'w' ) as myfile:
  with open( file, 'w' ) as myfile:
    myfile.write( converted_data )
  print 'updated: %s' % file


def convert( data ):

  modified = False
  pos = 0
  while pos>-1:
    pos = data.find( '* Java enum for ', pos )
    if pos<0: break

    start = pos
    start_line_end = data.find( '.', start )
    if start_line_end<0: break

    comment_end = data.find( '*/', start_line_end )
    if comment_end<0: break
    while data[comment_end-1].strip() == '':
      comment_end -= 1

    data = data[:start_line_end+1] + '\n' + data[comment_end:]
    pos += 1
    modified = True

  if not modified:
    return None

  return data


if __name__ == '__main__':
  for file in os.listdir( XML_DIR ):
    if file.endswith( ".java" ):
      cleanup( os.path.join( XML_DIR, file ) )
