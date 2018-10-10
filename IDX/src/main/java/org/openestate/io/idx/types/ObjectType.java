/*
 * Copyright 2015-2018 OpenEstate.org.
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

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ObjectType.
 *
 * @since 1.0
 * @author Andreas Rudolph
 */
public enum ObjectType
{
  /** Landwirtschaftsbetrieb / Agricultural installation */
  AGRI_GENERAL( ObjectCategory.AGRI, 1 ),

  /** Alpwirtschaft / Mountain farm */
  AGRI_ALPINE( ObjectCategory.AGRI, 2 ),

  /** Farm / Farm */
  AGRI_FARM( ObjectCategory.AGRI, 3 ),


  /** Wohnung / Apartment */
  APPT_GENERAL( ObjectCategory.APPT, 1 ),

  /** Maisonette/Duplex / Duplex */
  APPT_DUPLEX( ObjectCategory.APPT, 2 ),

  /** Attikawohnung / Attic flat */
  APPT_ATTIC_FLAT( ObjectCategory.APPT, 3 ),

  /** Dachwohnung / Roof flat */
  APPT_ROOF_FLAT( ObjectCategory.APPT, 4 ),

  /** Studio / Studio */
  APPT_STUDIO( ObjectCategory.APPT, 5 ),

  /** Einzelzimmer / Single Room */
  APPT_SINGLE_ROOM( ObjectCategory.APPT, 6 ),

  /** Möbl. Wohnobj. / Furnished flat */
  APPT_FURNISHED_FLAT( ObjectCategory.APPT, 7 ),

  /** Terrassenwohnung / Terrace flat */
  APPT_TERRACE_FLAT( ObjectCategory.APPT, 8 ),

  /** Einliegerwohnung / Bachelor flat */
  APPT_BACHERLOR_FLAT( ObjectCategory.APPT, 9 ),

  /** Loft / Loft */
  APPT_LOFT( ObjectCategory.APPT, 10 ),

  /** Mansarde / Attic */
  APPT_ATTIC( ObjectCategory.APPT, 11 ),


  /** Schrebergarten / Alottment garden */
  GARDEN_GENERAL( ObjectCategory.GARDEN, 1 ),


  /** Hotel / Hotel */
  GASTRO_HOTEL( ObjectCategory.GASTRO, 1 ),

  /** Restaurant / Restaurant */
  GASTRO_RESTAURANT( ObjectCategory.GASTRO, 2 ),

  /** Café / Coffeehouse */
  GASTRO_CAFE( ObjectCategory.GASTRO, 3 ),

  /** Bar / Bar */
  GASTRO_BAR( ObjectCategory.GASTRO, 4 ),

  /** Club/Disco / Club/Disco */
  GASTRO_CLUB_DISCO( ObjectCategory.GASTRO, 5 ),

  /** Casino / Casino */
  GASTRO_CASINO( ObjectCategory.GASTRO, 6 ),

  /** Kino/Theater / Movie/Theater */
  GASTRO_CINEMA_THEATRE( ObjectCategory.GASTRO, 7 ),

  /** Squash/Badminton / Squash/Badminton */
  GASTRO_SQUASH_BADMINTON( ObjectCategory.GASTRO, 8 ),

  /** Tennishalle / Indoor tennis courts */
  GASTRO_INDOOR_TENNIS( ObjectCategory.GASTRO, 9 ),

  /** Tennisplatz / Tennis court */
  GASTRO_OUTDOOR_TENNIS( ObjectCategory.GASTRO, 10 ),

  /** Sportanlage / Sports hall */
  GASTRO_SPORTS_HALL( ObjectCategory.GASTRO, 11 ),

  /** Camping-/Zeltplatz / Campground/Tent camping */
  GASTRO_CAMPING( ObjectCategory.GASTRO, 12 ),

  /** Freibad / Outdoor swimmingpool */
  GASTRO_OUTDOOR_SWIMMING( ObjectCategory.GASTRO, 13 ),

  /** Hallenbad / Indoor swimmingpool */
  GASTRO_INDOOR_SWIMMING( ObjectCategory.GASTRO, 14 ),

  /** Golfplatz / Golf course */
  GASTRO_GOLF( ObjectCategory.GASTRO, 15 ),

  /** Motel / Motel */
  GASTRO_MOTEL( ObjectCategory.GASTRO, 16 ),

  /** Pub / Pub */
  GASTRO_PUB( ObjectCategory.GASTRO, 17 ),


  /** Einfamilienhaus / Single house */
  HOUSE_SINGLE_FAMILY( ObjectCategory.HOUSE, 1 ),

  /** Reihenfamilienhaus / Row house */
  HOUSE_ROW( ObjectCategory.HOUSE, 2 ),

  /** Doppeleinfamilienhaus / Bifamiliar house */
  HOUSE_DUPLEX( ObjectCategory.HOUSE, 3 ),

  /** Terrassenhaus / Terrace house */
  HOUSE_TERRACE( ObjectCategory.HOUSE, 4 ),

  /** Villa / Villa */
  HOUSE_VILLA( ObjectCategory.HOUSE, 5 ),

  /** Bauernhaus / Farm house */
  HOUSE_FARM( ObjectCategory.HOUSE, 6 ),

  /** Mehrfamilienhaus / Multiple dwelling */
  HOUSE_MULTI_FAMILY( ObjectCategory.HOUSE, 7 ),

  /** Höhlen-/Erdhaus / Cave house/earthen house */
  HOUSE_CAVE_HOUSE( ObjectCategory.HOUSE, 9 ),

  /** Schloss / Castle */
  HOUSE_CASTLE( ObjectCategory.HOUSE, 10 ),

  /** Stöckli / Granny flat */
  HOUSE_GRANNY_FLAT( ObjectCategory.HOUSE, 11 ),

  /** Chalet / Chalet */
  HOUSE_CHALET( ObjectCategory.HOUSE, 12 ),

  /** Rustico / Rustic house */
  HOUSE_RUSTICO( ObjectCategory.HOUSE, 13 ),


  /** Büro / Office */
  INDUS_OFFICE( ObjectCategory.INDUS, 1 ),

  /** Ladenfläche / Shop */
  INDUS_SHOP( ObjectCategory.INDUS, 2 ),

  /** Werbefläche / Advertising area */
  INDUS_ADVERTISING( ObjectCategory.INDUS, 3 ),

  /** Gewerbe / Commercial */
  INDUS_COMMERCIAL( ObjectCategory.INDUS, 4 ),

  /** Lager / Storage room */
  INDUS_STORAGE( ObjectCategory.INDUS, 5 ),

  /** Praxis / Practice */
  INDUS_SURGERY( ObjectCategory.INDUS, 6 ),

  /** Kiosk / Kiosk */
  INDUS_KIOSK( ObjectCategory.INDUS, 7 ),

  /** Gärtnerei / Gardening */
  INDUS_GARDENING( ObjectCategory.INDUS, 8 ),

  /** Tankstelle / Fuel station */
  INDUS_FUEL_STATION( ObjectCategory.INDUS, 9 ),

  /** Autogarage / Garage */
  INDUS_GARAGE( ObjectCategory.INDUS, 10 ),

  /** Käserei / Cheese factory */
  INDUS_CHEESE_FACTORY( ObjectCategory.INDUS, 11 ),

  /** Metzgerei / Butcher */
  INDUS_BUTCHER( ObjectCategory.INDUS, 12 ),

  /** Bäckerei / Bakery */
  INDUS_BAKERY( ObjectCategory.INDUS, 13 ),

  /** Coiffeursalon / Hairdresser */
  INDUS_HAIRDRESSER( ObjectCategory.INDUS, 14 ),

  /** Shoppingcenter / Shopping centre */
  INDUS_SHOPPING_CENTRE( ObjectCategory.INDUS, 15 ),

  /** Fabrik / Factory */
  INDUS_FACTORY( ObjectCategory.INDUS, 16 ),

  /** Industrieobjekt / Industrial object */
  INDUS_INDUSTRY( ObjectCategory.INDUS, 17 ),

  /** Arcade / Arcade */
  INDUS_ARCADE( ObjectCategory.INDUS, 18 ),

  /** Atelier / Atelier */
  INDUS_ATELIER( ObjectCategory.INDUS, 19 ),

  /** Wohn-/Geschäftshaus / Living/commercial building */
  INDUS_LIVING_COMMERCIAL( ObjectCategory.INDUS, 20 ),

  /** Bücherei / Library */
  INDUS_LIBRARY( ObjectCategory.INDUS, 21 ),

  /** Krankenhaus / Hospital */
  INDUS_HOSPITAL( ObjectCategory.INDUS, 22 ),

  /** Labor / Laboratory */
  INDUS_LABORATORY( ObjectCategory.INDUS, 23 ),

  /** Minigolfplatz / Mini-golf course */
  INDUS_MINI_GOLF( ObjectCategory.INDUS, 24 ),

  /** Pflegeheim / nursing home */
  INDUS_NURSING( ObjectCategory.INDUS, 25 ),

  /** Reithalle / Riding hall */
  INDUS_RIDING_HALL( ObjectCategory.INDUS, 26 ),

  /** Sanatorium / Sanatorium */
  INDUS_SANATORIUM( ObjectCategory.INDUS, 27 ),

  /** Werkstatt / Workshop */
  INDUS_WORKSHOP( ObjectCategory.INDUS, 28 ),

  /** Partyraum / Party room */
  INDUS_PARTY_ROOM( ObjectCategory.INDUS, 29 ),

  /** Sauna / Sauna */
  INDUS_SAUNA( ObjectCategory.INDUS, 30 ),

  /** Solarium / Solarium */
  INDUS_SOLARIUM( ObjectCategory.INDUS, 31 ),

  /** Schreinerei / Carpentry shop */
  INDUS_CARPENTRY( ObjectCategory.INDUS, 32 ),

  /** Altersheim / Old-age home */
  INDUS_OLD_AGE_HOME( ObjectCategory.INDUS, 33 ),

  /** Geschäftshaus / Department store */
  INDUS_DEPARTMENT_STORE( ObjectCategory.INDUS, 34 ),

  /** Heim / Home */
  INDUS_HOME( ObjectCategory.INDUS, 35 ),

  /** Schaufenster / Display window */
  INDUS_DISPLAY_WINDOW( ObjectCategory.INDUS, 36 ),

  /** Parkhaus / Parking garage */
  INDUS_PARKING_GARAGE( ObjectCategory.INDUS, 37 ),

  /** Parkfläche / Parking surface */
  INDUS_PARKING_SURFACE( ObjectCategory.INDUS, 38 ),


  /** offener Parkplatz / Open slot */
  PARK_OPEN_SLOT( ObjectCategory.PARK, 1 ),

  /** Unterstand / Covered slot */
  PARK_COVERED_SLOT( ObjectCategory.PARK, 2 ),

  /** Einzelgarage / Single garage */
  PARK_SINGLE_GARAGE( ObjectCategory.PARK, 3 ),

  /** Doppelgarage / Double garage */
  PARK_DOUBLE_GARAGE( ObjectCategory.PARK, 4 ),

  /** Tiefgarage / Underground slot */
  PARK_UNDERGROUND_SLOT( ObjectCategory.PARK, 5 ),

  /** Boot Hallenplatz / Boat dry dock */
  PARK_BOAT_DRY_DOCK( ObjectCategory.PARK, 7 ),

  /** Boot Stegplatz / Boat landing stage */
  PARK_BOAT_LANDING_STAGE( ObjectCategory.PARK, 8 ),

  /** Moto Hallenplatz / Covered parking place bike */
  PARK_BIKE_INDOOR( ObjectCategory.PARK, 9 ),

  /** Moto Aussenplatz / Outdoor parking place bike */
  PARK_BIKE_OUTDOOR( ObjectCategory.PARK, 10 ),

  /** Stallboxe / Horse box */
  PARK_HORSE_BOX( ObjectCategory.PARK, 11 ),

  /** Boot Bojenplatz / Boat mooring */
  PARK_BOAT_MOORING( ObjectCategory.PARK, 12 ),


  /** Bauland / Building land */
  PROP_BUILDING( ObjectCategory.PROP, 1 ),

  /** Agrarland / Agricultural land */
  PROP_AGRICULTURAL( ObjectCategory.PROP, 2 ),

  /** Gewerbeland / Commercial land */
  PROP_COMMERCIAL( ObjectCategory.PROP, 3 ),

  /** Industriebauland / Industrial land */
  PROP_INDUSTRIAL( ObjectCategory.PROP, 4 ),


  /** Hobbyraum / Hobby room */
  SECONDARY_HOBBY_ROOM( ObjectCategory.SECONDARY, 0 ),

  /** Kellerabteil / Cellar compartment */
  SECONDARY_CELLAR_PART( ObjectCategory.SECONDARY, 1 ),

  /** Estrichabteil / Attic compartment */
  SECONDARY_ATTIC_COMPARTMENT( ObjectCategory.SECONDARY, 2 );

  private final static Logger LOGGER = LoggerFactory.getLogger( ObjectType.class );
  private final ObjectCategory category;
  private final int value;

  private ObjectType( ObjectCategory category, int value )
  {
    this.category = category;
    this.value = value;
  }

  public ObjectCategory getCategory()
  {
    return category;
  }

  public static ObjectType parse( ObjectCategory category, String value )
  {
    if (category==null) return null;
    value = StringUtils.trimToNull( value );
    if (value==null) return null;
    try
    {
      int num = Integer.parseInt( value );
      for (ObjectType t : ObjectType.values())
      {
        if (category.equals( t.category ) && num==t.value)
          return t;
      }
      return null;
    }
    catch (Exception ex)
    {
      return null;
    }
  }

  public String print()
  {
    return String.valueOf( this.value );
  }
}