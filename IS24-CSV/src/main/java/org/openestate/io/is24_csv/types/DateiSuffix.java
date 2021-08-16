/*
 * Copyright 2015-2021 OpenEstate.org.
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
package org.openestate.io.is24_csv.types;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DateiSuffix.
 *
 * @author Andreas Rudolph
 * @since 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public enum DateiSuffix {
    BMP(".BMP"),
    GIF(".GIF"),
    PNG(".PNG"),
    JPG(".JPG"),
    WBMP(".WBMP"),
    JPEG(".JPEG"),
    MOV(".MOV"),
    QT(".QT"),
    QTL(".QTL"),
    RM(".RM"),
    RV(".RV"),
    MPE(".MPE"),
    MPG(".MPG"),
    MPEG(".MPEG"),
    MP4(".MP4"),
    WMV(".WMV"),
    AVI(".AVI"),
    PDF(".PDF");

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(DateiSuffix.class);
    private final String value;

    DateiSuffix(String value) {
        this.value = value;
    }

    public static DateiSuffix fromFileName(String fileName) {
        fileName = StringUtils.lowerCase(StringUtils.trimToNull(fileName));
        if (fileName != null) {
            for (DateiSuffix s : DateiSuffix.values()) {
                if (fileName.endsWith(s.name().toLowerCase())) {
                    return s;
                }
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    public static DateiSuffix fromMimeType(String mimeType) {
        mimeType = StringUtils.lowerCase(StringUtils.trimToNull(mimeType));

        if ("video/x-msvideo".equals(mimeType))
            return AVI;

        else if ("image/bmp".equals(mimeType))
            return BMP;

        else if ("image/gif".equals(mimeType))
            return GIF;

        else if ("image/jpeg".equals(mimeType))
            return JPG;

        else if ("video/quicktime".equals(mimeType))
            return MOV;

        else if ("video/mp4".equals(mimeType))
            return MP4;

            //else if ("video/mpeg".equals( mimeType ))
            //  return MPE;

        else if ("video/mpeg".equals(mimeType))
            return MPEG;

            //else if ("video/mpeg".equals( mimeType ))
            //  return MPG;

        else if ("application/pdf".equals(mimeType))
            return PDF;

        else if ("image/png".equals(mimeType))
            return PNG;

            //else if ("video/quicktime".equals( mimeType ))
            //  return QT;

            //else if ("video/quicktime".equals( mimeType ))
            //  return QTL;

        else if ("application/vnd.rn-realmedia".equals(mimeType))
            return RM;

        else if ("video/vnd.rn-realvideo".equals(mimeType))
            return RV;

        else if ("video/x-ms-wmv".equals(mimeType))
            return WMV;

        else
            return null;
    }

    public String getMimeType() {
        switch (this) {
            case AVI:
                return "video/x-msvideo";

            case BMP:
                return "image/bmp";

            case GIF:
                return "image/gif";

            case JPG:
                return "image/jpeg";

            case MOV:
            case QT:
            case QTL:
                return "video/quicktime";

            case MP4:
                return "video/mp4";

            case MPE:
            case MPEG:
            case MPG:
                return "video/mpeg";

            case PDF:
                return "application/pdf";

            case PNG:
                return "image/png";

            case RM:
                return "application/vnd.rn-realmedia";

            case RV:
                return "video/vnd.rn-realvideo";

            case WMV:
                return "video/x-ms-wmv";

            default:
                return "application/octet-stream";
        }
    }

    public static DateiSuffix parse(String value) {
        value = StringUtils.trimToNull(value);
        if (value == null) return null;

        for (DateiSuffix t : DateiSuffix.values()) {
            if (t.value.equalsIgnoreCase(value) || t.name().equalsIgnoreCase(value)) {
                return t;
            }
        }
        return null;
    }

    public String print() {
        return this.value;
    }
}