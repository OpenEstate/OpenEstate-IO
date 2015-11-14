/*
 * Copyright 2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openestate.io.idx.types;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;

/**
 * Media.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public class Media implements Serializable
{
  private final static long serialVersionUID = 5668966682578880420L;

  private String fileName;
  private String title;
  private String description;
  private String url;

  private final static String SUFFIX_AVI = ".avi";
  private final static String SUFFIX_DOC = ".doc";
  private final static String SUFFIX_FLV = ".flv";
  private final static String SUFFIX_GIF = ".gif";
  private final static String SUFFIX_JPG = ".jpg";
  private final static String SUFFIX_JPEG = ".jpeg";
  private final static String SUFFIX_MP4 = ".mp4";
  private final static String SUFFIX_MPG = ".mpg";
  private final static String SUFFIX_MPEG = ".mpeg";
  private final static String SUFFIX_MOV = ".mov";
  private final static String SUFFIX_PDF = ".pdf";
  private final static String SUFFIX_RPM = ".rpm";
  private final static String SUFFIX_RTF = ".rtf";
  private final static String SUFFIX_WMV = ".wmv";

  public Media()
  {
    this( null, null, null, null );
  }

  public Media( String fileName )
  {
    this( fileName, null, null, null );
  }

  public Media( String fileName, String title )
  {
    this( fileName, title, null, null );
  }

  public Media( String fileName, String title, String description )
  {
    this( fileName, title, description, null );
  }

  public Media( String fileName, String title, String description, String url )
  {
    this.fileName = fileName;
    this.title = title;
    this.description = description;
    this.url = url;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getFileName()
  {
    return this.fileName;
  }

  public String getTitle()
  {
    return this.title;
  }

  public String getUrl()
  {
    return this.url;
  }

  public String guessMimeType()
  {
    String n = StringUtils.lowerCase(
      (!StringUtils.isBlank( this.fileName ))? this.fileName: this.url );

    if ( n.endsWith( SUFFIX_AVI ) )
      return "video/x-msvideo";

    else if ( n.endsWith( SUFFIX_DOC ) )
      return "application/msword";

    else if (n.endsWith( SUFFIX_FLV ))
      return "video/x-flv";

    else if (n.endsWith( SUFFIX_GIF ))
      return "image/gif";

    else if (n.endsWith( SUFFIX_JPEG ))
      return "image/jpeg";

    else if (n.endsWith( SUFFIX_JPG ))
      return "image/jpeg";

    else if (n.endsWith( SUFFIX_MOV ))
      return "video/quicktime";

    else if (n.endsWith( SUFFIX_MP4 ))
      return "video/mp4";

    else if (n.endsWith( SUFFIX_MPEG ))
      return "video/mpeg";

    else if (n.endsWith( SUFFIX_MPG ))
      return "video/mpeg";

    else if (n.endsWith( SUFFIX_PDF ))
      return "application/pdf";

    else if (n.endsWith( SUFFIX_RPM ))
      return "video/vnd.rn-realvideo";

    else if (n.endsWith( SUFFIX_RTF ))
      return "application/rtf";

    else if (n.endsWith( SUFFIX_WMV ))
      return "video/x-ms-wmv";

    else
      return "application/octet-stream";
  }

  public boolean isDocument()
  {
    return isDocument( this.fileName );
  }

  public static boolean isDocument( String fileName )
  {
    if (StringUtils.isBlank( fileName )) return false;
    String n = fileName.toLowerCase().trim();
    return n.endsWith( SUFFIX_PDF )
      || n.endsWith( SUFFIX_RTF )
      || n.endsWith( SUFFIX_DOC );
  }

  public boolean isImage()
  {
    return isImage( this.fileName );
  }

  public static boolean isImage( String fileName )
  {
    if (StringUtils.isBlank(fileName)) return false;
    String n = fileName.toLowerCase().trim();
    return n.endsWith( SUFFIX_JPEG )
      || n.endsWith( SUFFIX_JPG )
      || n.endsWith( SUFFIX_GIF );
  }

  public boolean isMovie()
  {
    return isMovie( this.fileName );
  }

  public static boolean isMovie( String fileName )
  {
    if (StringUtils.isBlank(fileName)) return false;
    String n = fileName.toLowerCase().trim();
    return n.endsWith( SUFFIX_MOV )
      || n.endsWith( SUFFIX_AVI )
      || n.endsWith( SUFFIX_RPM )
      || n.endsWith( SUFFIX_MPG )
      || n.endsWith( SUFFIX_MPEG )
      || n.endsWith( SUFFIX_WMV )
      || n.endsWith( SUFFIX_MP4 )
      || n.endsWith( SUFFIX_FLV );
  }

  public void setDescription( String value )
  {
    this.description = StringUtils.trimToNull( value );
  }

  public void setFileName( String value )
  {
    this.fileName = StringUtils.trimToNull( value );
  }

  public void setTitle( String value )
  {
    this.title = StringUtils.trimToNull( value );
  }

  public void setUrl( String value )
  {
    this.url = StringUtils.trimToNull( value );
  }
}