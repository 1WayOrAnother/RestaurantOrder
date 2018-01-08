# RestaurantOrder

#### _This is web application for the Restaurant order, 1/5/2018_

#### _made by **1wayoranother**_

##  Description

_This application prompts user to order the restaurant reservation for party with details that includes quantity of people attending, music, food and drinks.
It calculates seats ordered and additional details, initially it returns the estimated cost for the party._

### Specification
| Behavior | Input | Output |
| :-------------     | :------------- | :------------- |
| it returns Cost Only For Music With Wrong Coupon number | guest Count = 100, food = false, drinks = false, music = true, coupon number = "7899" | 3500 |
| it returns Cost Only For Drinks With No Coupon | guest Count = 100, food = false, drinks = true, music = false, coupon number = "no" | 2500 |
| it returns Cost Only For Food With No Coupon | guest Count = 100, food = true, drinks = false, music = false, coupon number = "no" | 1500 |
| it returns Cost Only For Food With No Coupon | guest Count = 100, food = false, drinks = true, music = true, coupon number = "#B17" | 6000 |
| it returns Cost Only For Drinks And Music With Coupon Code | guest Count = 100, food = false, drinks = true, music = false, coupon number = "no" | 5945 |
| it returns Cost Only For Music With No Coupon 10 people | guest Count = 10, food = false, drinks = true, music = false, coupon number = "no" | 250 |
| it returns Cost Only For Music With No Coupon 1 person | guest Count = 1, food = false, drinks = true, music = false, coupon number = "no" | 25 |




Setup
Clone this repo
run App.java
Technologies Used
Java
Github
Intellij CE

Copyright (c) 2017 1wayoranother
