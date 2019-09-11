@focus
Feature: As a customer I should be able to search the product for purchase in Amazon

@Testgoogle
Scenario Outline:
  Given The web site page type "<PageType>" is opened as "<ScreenSize>"
  When I search "<Keyword>"
  Then The page title should contains "<Keyword>"

 Examples:
    | PageType | ScreenSize | Keyword|
    | search | hd-desktop | doko meaning in japanese|
    | search | hd-desktop | tsumimasen meaning in japanese|

@TestAmazon
Scenario Outline:
Given The web site page type "<PageType>" is opened as "<ScreenSize>"
Then The page title should contains "<Keyword>"
Then The User searches for product contains "<category>"
Examples:
    | PageType | ScreenSize| Keyword| category|
    | search | hd-desktop |Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in|Mobile Phones|