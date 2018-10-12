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
 * @author Andreas Rudolph
 * @since 1.0
 */
public enum ObjectType {
    /**
     * Landwirtschaftsbetrieb / Agricultural installation
     */
    @SuppressWarnings("unused")
    AGRI_GENERAL(ObjectCategory.AGRI, 1),

    /**
     * Alpwirtschaft / Mountain farm
     */
    @SuppressWarnings("unused")
    AGRI_ALPINE(ObjectCategory.AGRI, 2),

    /**
     * Farm / Farm
     */
    @SuppressWarnings("unused")
    AGRI_FARM(ObjectCategory.AGRI, 3),


    /**
     * Wohnung / Apartment
     */
    @SuppressWarnings("unused")
    APPT_GENERAL(ObjectCategory.APPT, 1),

    /**
     * Maisonette/Duplex / Duplex
     */
    @SuppressWarnings("unused")
    APPT_DUPLEX(ObjectCategory.APPT, 2),

    /**
     * Attikawohnung / Attic flat
     */
    @SuppressWarnings("unused")
    APPT_ATTIC_FLAT(ObjectCategory.APPT, 3),

    /**
     * Dachwohnung / Roof flat
     */
    @SuppressWarnings("unused")
    APPT_ROOF_FLAT(ObjectCategory.APPT, 4),

    /**
     * Studio / Studio
     */
    @SuppressWarnings("unused")
    APPT_STUDIO(ObjectCategory.APPT, 5),

    /**
     * Einzelzimmer / Single Room
     */
    @SuppressWarnings("unused")
    APPT_SINGLE_ROOM(ObjectCategory.APPT, 6),

    /**
     * Möbl. Wohnobj. / Furnished flat
     */
    @SuppressWarnings("unused")
    APPT_FURNISHED_FLAT(ObjectCategory.APPT, 7),

    /**
     * Terrassenwohnung / Terrace flat
     */
    @SuppressWarnings("unused")
    APPT_TERRACE_FLAT(ObjectCategory.APPT, 8),

    /**
     * Einliegerwohnung / Bachelor flat
     */
    @SuppressWarnings("unused")
    APPT_BACHERLOR_FLAT(ObjectCategory.APPT, 9),

    /**
     * Loft / Loft
     */
    @SuppressWarnings("unused")
    APPT_LOFT(ObjectCategory.APPT, 10),

    /**
     * Mansarde / Attic
     */
    @SuppressWarnings("unused")
    APPT_ATTIC(ObjectCategory.APPT, 11),


    /**
     * Schrebergarten / Alottment garden
     */
    @SuppressWarnings("unused")
    GARDEN_GENERAL(ObjectCategory.GARDEN, 1),


    /**
     * Hotel / Hotel
     */
    @SuppressWarnings("unused")
    GASTRO_HOTEL(ObjectCategory.GASTRO, 1),

    /**
     * Restaurant / Restaurant
     */
    @SuppressWarnings("unused")
    GASTRO_RESTAURANT(ObjectCategory.GASTRO, 2),

    /**
     * Café / Coffeehouse
     */
    @SuppressWarnings("unused")
    GASTRO_CAFE(ObjectCategory.GASTRO, 3),

    /**
     * Bar / Bar
     */
    @SuppressWarnings("unused")
    GASTRO_BAR(ObjectCategory.GASTRO, 4),

    /**
     * Club/Disco / Club/Disco
     */
    @SuppressWarnings("unused")
    GASTRO_CLUB_DISCO(ObjectCategory.GASTRO, 5),

    /**
     * Casino / Casino
     */
    @SuppressWarnings("unused")
    GASTRO_CASINO(ObjectCategory.GASTRO, 6),

    /**
     * Kino/Theater / Movie/Theater
     */
    @SuppressWarnings("unused")
    GASTRO_CINEMA_THEATRE(ObjectCategory.GASTRO, 7),

    /**
     * Squash/Badminton / Squash/Badminton
     */
    @SuppressWarnings("unused")
    GASTRO_SQUASH_BADMINTON(ObjectCategory.GASTRO, 8),

    /**
     * Tennishalle / Indoor tennis courts
     */
    @SuppressWarnings("unused")
    GASTRO_INDOOR_TENNIS(ObjectCategory.GASTRO, 9),

    /**
     * Tennisplatz / Tennis court
     */
    @SuppressWarnings("unused")
    GASTRO_OUTDOOR_TENNIS(ObjectCategory.GASTRO, 10),

    /**
     * Sportanlage / Sports hall
     */
    @SuppressWarnings("unused")
    GASTRO_SPORTS_HALL(ObjectCategory.GASTRO, 11),

    /**
     * Camping-/Zeltplatz / Campground/Tent camping
     */
    @SuppressWarnings("unused")
    GASTRO_CAMPING(ObjectCategory.GASTRO, 12),

    /**
     * Freibad / Outdoor swimmingpool
     */
    @SuppressWarnings("unused")
    GASTRO_OUTDOOR_SWIMMING(ObjectCategory.GASTRO, 13),

    /**
     * Hallenbad / Indoor swimmingpool
     */
    @SuppressWarnings("unused")
    GASTRO_INDOOR_SWIMMING(ObjectCategory.GASTRO, 14),

    /**
     * Golfplatz / Golf course
     */
    @SuppressWarnings("unused")
    GASTRO_GOLF(ObjectCategory.GASTRO, 15),

    /**
     * Motel / Motel
     */
    @SuppressWarnings("unused")
    GASTRO_MOTEL(ObjectCategory.GASTRO, 16),

    /**
     * Pub / Pub
     */
    @SuppressWarnings("unused")
    GASTRO_PUB(ObjectCategory.GASTRO, 17),


    /**
     * Einfamilienhaus / Single house
     */
    @SuppressWarnings("unused")
    HOUSE_SINGLE_FAMILY(ObjectCategory.HOUSE, 1),

    /**
     * Reihenfamilienhaus / Row house
     */
    @SuppressWarnings("unused")
    HOUSE_ROW(ObjectCategory.HOUSE, 2),

    /**
     * Doppeleinfamilienhaus / Bifamiliar house
     */
    @SuppressWarnings("unused")
    HOUSE_DUPLEX(ObjectCategory.HOUSE, 3),

    /**
     * Terrassenhaus / Terrace house
     */
    @SuppressWarnings("unused")
    HOUSE_TERRACE(ObjectCategory.HOUSE, 4),

    /**
     * Villa / Villa
     */
    @SuppressWarnings("unused")
    HOUSE_VILLA(ObjectCategory.HOUSE, 5),

    /**
     * Bauernhaus / Farm house
     */
    @SuppressWarnings("unused")
    HOUSE_FARM(ObjectCategory.HOUSE, 6),

    /**
     * Mehrfamilienhaus / Multiple dwelling
     */
    @SuppressWarnings("unused")
    HOUSE_MULTI_FAMILY(ObjectCategory.HOUSE, 7),

    /**
     * Höhlen-/Erdhaus / Cave house/earthen house
     */
    @SuppressWarnings("unused")
    HOUSE_CAVE_HOUSE(ObjectCategory.HOUSE, 9),

    /**
     * Schloss / Castle
     */
    @SuppressWarnings("unused")
    HOUSE_CASTLE(ObjectCategory.HOUSE, 10),

    /**
     * Stöckli / Granny flat
     */
    @SuppressWarnings("unused")
    HOUSE_GRANNY_FLAT(ObjectCategory.HOUSE, 11),

    /**
     * Chalet / Chalet
     */
    @SuppressWarnings("unused")
    HOUSE_CHALET(ObjectCategory.HOUSE, 12),

    /**
     * Rustico / Rustic house
     */
    @SuppressWarnings("unused")
    HOUSE_RUSTICO(ObjectCategory.HOUSE, 13),


    /**
     * Büro / Office
     */
    @SuppressWarnings("unused")
    INDUS_OFFICE(ObjectCategory.INDUS, 1),

    /**
     * Ladenfläche / Shop
     */
    @SuppressWarnings("unused")
    INDUS_SHOP(ObjectCategory.INDUS, 2),

    /**
     * Werbefläche / Advertising area
     */
    @SuppressWarnings("unused")
    INDUS_ADVERTISING(ObjectCategory.INDUS, 3),

    /**
     * Gewerbe / Commercial
     */
    @SuppressWarnings("unused")
    INDUS_COMMERCIAL(ObjectCategory.INDUS, 4),

    /**
     * Lager / Storage room
     */
    @SuppressWarnings("unused")
    INDUS_STORAGE(ObjectCategory.INDUS, 5),

    /**
     * Praxis / Practice
     */
    @SuppressWarnings("unused")
    INDUS_SURGERY(ObjectCategory.INDUS, 6),

    /**
     * Kiosk / Kiosk
     */
    @SuppressWarnings("unused")
    INDUS_KIOSK(ObjectCategory.INDUS, 7),

    /**
     * Gärtnerei / Gardening
     */
    @SuppressWarnings("unused")
    INDUS_GARDENING(ObjectCategory.INDUS, 8),

    /**
     * Tankstelle / Fuel station
     */
    @SuppressWarnings("unused")
    INDUS_FUEL_STATION(ObjectCategory.INDUS, 9),

    /**
     * Autogarage / Garage
     */
    @SuppressWarnings("unused")
    INDUS_GARAGE(ObjectCategory.INDUS, 10),

    /**
     * Käserei / Cheese factory
     */
    @SuppressWarnings("unused")
    INDUS_CHEESE_FACTORY(ObjectCategory.INDUS, 11),

    /**
     * Metzgerei / Butcher
     */
    @SuppressWarnings("unused")
    INDUS_BUTCHER(ObjectCategory.INDUS, 12),

    /**
     * Bäckerei / Bakery
     */
    @SuppressWarnings("unused")
    INDUS_BAKERY(ObjectCategory.INDUS, 13),

    /**
     * Coiffeursalon / Hairdresser
     */
    @SuppressWarnings("unused")
    INDUS_HAIRDRESSER(ObjectCategory.INDUS, 14),

    /**
     * Shoppingcenter / Shopping centre
     */
    @SuppressWarnings("unused")
    INDUS_SHOPPING_CENTRE(ObjectCategory.INDUS, 15),

    /**
     * Fabrik / Factory
     */
    @SuppressWarnings("unused")
    INDUS_FACTORY(ObjectCategory.INDUS, 16),

    /**
     * Industrieobjekt / Industrial object
     */
    @SuppressWarnings("unused")
    INDUS_INDUSTRY(ObjectCategory.INDUS, 17),

    /**
     * Arcade / Arcade
     */
    @SuppressWarnings("unused")
    INDUS_ARCADE(ObjectCategory.INDUS, 18),

    /**
     * Atelier / Atelier
     */
    @SuppressWarnings("unused")
    INDUS_ATELIER(ObjectCategory.INDUS, 19),

    /**
     * Wohn-/Geschäftshaus / Living/commercial building
     */
    @SuppressWarnings("unused")
    INDUS_LIVING_COMMERCIAL(ObjectCategory.INDUS, 20),

    /**
     * Bücherei / Library
     */
    @SuppressWarnings("unused")
    INDUS_LIBRARY(ObjectCategory.INDUS, 21),

    /**
     * Krankenhaus / Hospital
     */
    @SuppressWarnings("unused")
    INDUS_HOSPITAL(ObjectCategory.INDUS, 22),

    /**
     * Labor / Laboratory
     */
    @SuppressWarnings("unused")
    INDUS_LABORATORY(ObjectCategory.INDUS, 23),

    /**
     * Minigolfplatz / Mini-golf course
     */
    @SuppressWarnings("unused")
    INDUS_MINI_GOLF(ObjectCategory.INDUS, 24),

    /**
     * Pflegeheim / nursing home
     */
    @SuppressWarnings("unused")
    INDUS_NURSING(ObjectCategory.INDUS, 25),

    /**
     * Reithalle / Riding hall
     */
    @SuppressWarnings("unused")
    INDUS_RIDING_HALL(ObjectCategory.INDUS, 26),

    /**
     * Sanatorium / Sanatorium
     */
    @SuppressWarnings("unused")
    INDUS_SANATORIUM(ObjectCategory.INDUS, 27),

    /**
     * Werkstatt / Workshop
     */
    @SuppressWarnings("unused")
    INDUS_WORKSHOP(ObjectCategory.INDUS, 28),

    /**
     * Partyraum / Party room
     */
    @SuppressWarnings("unused")
    INDUS_PARTY_ROOM(ObjectCategory.INDUS, 29),

    /**
     * Sauna / Sauna
     */
    @SuppressWarnings("unused")
    INDUS_SAUNA(ObjectCategory.INDUS, 30),

    /**
     * Solarium / Solarium
     */
    @SuppressWarnings("unused")
    INDUS_SOLARIUM(ObjectCategory.INDUS, 31),

    /**
     * Schreinerei / Carpentry shop
     */
    @SuppressWarnings("unused")
    INDUS_CARPENTRY(ObjectCategory.INDUS, 32),

    /**
     * Altersheim / Old-age home
     */
    @SuppressWarnings("unused")
    INDUS_OLD_AGE_HOME(ObjectCategory.INDUS, 33),

    /**
     * Geschäftshaus / Department store
     */
    @SuppressWarnings("unused")
    INDUS_DEPARTMENT_STORE(ObjectCategory.INDUS, 34),

    /**
     * Heim / Home
     */
    @SuppressWarnings("unused")
    INDUS_HOME(ObjectCategory.INDUS, 35),

    /**
     * Schaufenster / Display window
     */
    @SuppressWarnings("unused")
    INDUS_DISPLAY_WINDOW(ObjectCategory.INDUS, 36),

    /**
     * Parkhaus / Parking garage
     */
    @SuppressWarnings("unused")
    INDUS_PARKING_GARAGE(ObjectCategory.INDUS, 37),

    /**
     * Parkfläche / Parking surface
     */
    @SuppressWarnings("unused")
    INDUS_PARKING_SURFACE(ObjectCategory.INDUS, 38),


    /**
     * offener Parkplatz / Open slot
     */
    @SuppressWarnings("unused")
    PARK_OPEN_SLOT(ObjectCategory.PARK, 1),

    /**
     * Unterstand / Covered slot
     */
    @SuppressWarnings("unused")
    PARK_COVERED_SLOT(ObjectCategory.PARK, 2),

    /**
     * Einzelgarage / Single garage
     */
    @SuppressWarnings("unused")
    PARK_SINGLE_GARAGE(ObjectCategory.PARK, 3),

    /**
     * Doppelgarage / Double garage
     */
    @SuppressWarnings("unused")
    PARK_DOUBLE_GARAGE(ObjectCategory.PARK, 4),

    /**
     * Tiefgarage / Underground slot
     */
    @SuppressWarnings("unused")
    PARK_UNDERGROUND_SLOT(ObjectCategory.PARK, 5),

    /**
     * Boot Hallenplatz / Boat dry dock
     */
    @SuppressWarnings("unused")
    PARK_BOAT_DRY_DOCK(ObjectCategory.PARK, 7),

    /**
     * Boot Stegplatz / Boat landing stage
     */
    @SuppressWarnings("unused")
    PARK_BOAT_LANDING_STAGE(ObjectCategory.PARK, 8),

    /**
     * Moto Hallenplatz / Covered parking place bike
     */
    @SuppressWarnings("unused")
    PARK_BIKE_INDOOR(ObjectCategory.PARK, 9),

    /**
     * Moto Aussenplatz / Outdoor parking place bike
     */
    @SuppressWarnings("unused")
    PARK_BIKE_OUTDOOR(ObjectCategory.PARK, 10),

    /**
     * Stallboxe / Horse box
     */
    @SuppressWarnings("unused")
    PARK_HORSE_BOX(ObjectCategory.PARK, 11),

    /**
     * Boot Bojenplatz / Boat mooring
     */
    @SuppressWarnings("unused")
    PARK_BOAT_MOORING(ObjectCategory.PARK, 12),


    /**
     * Bauland / Building land
     */
    @SuppressWarnings("unused")
    PROP_BUILDING(ObjectCategory.PROP, 1),

    /**
     * Agrarland / Agricultural land
     */
    @SuppressWarnings("unused")
    PROP_AGRICULTURAL(ObjectCategory.PROP, 2),

    /**
     * Gewerbeland / Commercial land
     */
    @SuppressWarnings("unused")
    PROP_COMMERCIAL(ObjectCategory.PROP, 3),

    /**
     * Industriebauland / Industrial land
     */
    @SuppressWarnings("unused")
    PROP_INDUSTRIAL(ObjectCategory.PROP, 4),


    /**
     * Hobbyraum / Hobby room
     */
    @SuppressWarnings("unused")
    SECONDARY_HOBBY_ROOM(ObjectCategory.SECONDARY, 0),

    /**
     * Kellerabteil / Cellar compartment
     */
    @SuppressWarnings("unused")
    SECONDARY_CELLAR_PART(ObjectCategory.SECONDARY, 1),

    /**
     * Estrichabteil / Attic compartment
     */
    @SuppressWarnings("unused")
    SECONDARY_ATTIC_COMPARTMENT(ObjectCategory.SECONDARY, 2);

    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ObjectType.class);
    private final ObjectCategory category;
    private final int value;

    ObjectType(ObjectCategory category, int value) {
        this.category = category;
        this.value = value;
    }

    public ObjectCategory getCategory() {
        return category;
    }

    public static ObjectType parse(ObjectCategory category, String value) {
        if (category == null) return null;
        value = StringUtils.trimToNull(value);
        if (value == null) return null;
        try {
            int num = Integer.parseInt(value);
            for (ObjectType t : ObjectType.values()) {
                if (category.equals(t.category) && num == t.value)
                    return t;
            }
            return null;
        } catch (Exception ex) {
            return null;
        }
    }

    public String print() {
        return String.valueOf(this.value);
    }
}