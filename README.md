# ProjectOne

# App Screens
SCREEN ONE - EventScreen
  Day - Date - Titles
    > OnClick expand to show full event details

SCREEN TWO - SearchScreen with filters for
    > Keyword, Day, Date, Category

# EVENTS DATABASE
Database file to hold event info is at 52.26.82.108/events/events.db. This has been updated to hold two weeks of events beginning with Monday, Sept 28.

Database schema (as of 2015/09/20 21:44 CT) for events.db and table event_t:
id INTEGER, day TEXT, month TEXT, date INTEGER, title TEXT, time TEXT, venue TEXT, category TEXT, description TEXT, e_link TEXT, tickets TEXT, cost TEXT, age TEXT

  Example:
  1|TUE|SEPT|29|SummerMusic plays "in C"|19:30|Kum & Go Theater|Music|SummerMusic plays ΓÇ£In CΓÇ¥ ΓÇö composer Terry RileyΓÇÖs legendary experiment in musical democracy. Plus m
  usic by Philip Glass, and Bruno Mantovani. With Bruce Brubaker, Jonathan Sturm, Nicholas Roth, Gregory Oakes, Sonia Giles, and others.|http://desmoinessocialclub.org/events/su
  mmermusic-plays-in-c/|At the Door|$10|

Note it looks like we do still have some special character issues to address in the event description.
