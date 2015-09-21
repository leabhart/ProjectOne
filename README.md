# ProjectOne

# App Screens
SCREEN ONE - EventScreen
  Day - Date - Titles
    > OnClick expand to show full event details

SCREEN TWO - SearchScreen with filters for
    > Keyword, Day, Date, Category

# EVENTS DATABASE
Database file to hold event info is at 52.26.82.108/events/events.db. This is currently set up with basic info which we will need to expand upon.

Database schema (as of 2015/09/17 21:58 CT):

event_t (id smallint, title varchar(50), category varchar(20), venue varchar(20), more varchar(50), ticket varchar(50));
Example row: 1 | Libations 101 | Culinary | The Basement | http://bit.ly/1QKlCcH | http://bit.ly/1OislMO
