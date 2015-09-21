# ProjectOne

# App Screens
SCREEN ONE - EventScreen
  Day - Date - Titles
    > OnClick expand to show full event details

SCREEN TWO - SearchScreen with filters for
    > Keyword, Day, Date, Category
    
SCREEN THREE - SearchResultScreen

# EVENTS DATABASE
Database file to hold event info is at 52.26.82.108/events/events.db. This has been updated to hold two weeks of events beginning with Monday, Sept 28.

Database schema (as of 2015/09/20 21:44 CT) for events.db and table event_t:
id INTEGER, day TEXT, month TEXT, date INTEGER, title TEXT, time TEXT, venue TEXT, category TEXT, description TEXT, e_link TEXT, tickets TEXT, cost TEXT, age TEXT

  Example:
  1|TUE|SEPT|29|SummerMusic plays "in C"|19:30|Kum & Go Theater|Music|SummerMusic plays ΓÇ£In CΓÇ¥ ΓÇö composer Terry RileyΓÇÖs legendary experiment in musical democracy. Plus m
  usic by Philip Glass, and Bruno Mantovani. With Bruce Brubaker, Jonathan Sturm, Nicholas Roth, Gregory Oakes, Sonia Giles, and others.|http://desmoinessocialclub.org/events/su
  mmermusic-plays-in-c/|At the Door|$10|

Note it looks like we do still have some special character issues to address in the event description.

DESIGN
Colors:
MON 28 - #f48fb1
TUES 29 - #f06292
WED 30 - #ec407a
THURS 1 - #e91ee63
FRI 2 - #d81b60
SAT 3 - #c2185b
SUN 4 - #ad1457
(Repeat colors for following week)

TEXT COLORS
Pink text: #e91e63
Black text: #030303

Fonts used:
Roboto (Light, Medium, Regular)

Home screen (Event page) 
Date: Roboto Med
Day: Roboto Light
Event name: Roboto Regular
*All text is white

Specific Day (Event drop down)
Time: Roboto Light
Location: Roboto Light, pink text color
Title: Roboto Regular
Description: Roboto Light
Tickets link: Roboto Med, pink text color
*Unless indicated, text is black

Search page
Search bar: Roboto regular
Weekdays: Roboto regular *change to black color, diff from mockups
Dates: Roboto regular *make active days pink, dates with no events can be faded pink
Boxes/buttons: Pink text color
Categories: Roboto regular

No Results Toast
Text: Roboto regular, pink text color
Box color: #e0e0e0
