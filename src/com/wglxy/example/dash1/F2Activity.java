/*
 * Copyright (C) 2011 Wglxy.com
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

package com.wglxy.example.dash1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * This is the activity for feature 2 in the dashboard application.
 * It displays some text and provides a way to get back to the home activity.
 *
 */

public class F2Activity extends DashboardActivity 
{

/**
 * onCreate
 *
 * Called when the activity is first created. 
 * This is where you should do all of your normal static set up: create views, bind data to lists, etc. 
 * This method also provides you with a Bundle containing the activity's previously frozen state, if there was one.
 * 
 * Always followed by onStart().
 *
 * @param savedInstanceState Bundle
 */

protected void onCreate(Bundle savedInstanceState) 
{
    super.onCreate(savedInstanceState);
    setContentView (R.layout.activity_f2);
    setTitleFromActivityLabel (R.id.title_text);

    String NonVegList[] = {    
    "Beef Fry",
    "Chicken Curry",
    "Chicken Thoran",
    "Dry Prawns with Cabbage",
    "Egg Koottu",
    "Fish Mappas",
    "Fish Masala Wrapped in Banana Leaf",
    "Fish Moilee",
    "Kerala Fish Curry",
    "Malabar Mutton Biriyani",
    "Meen Peera",
    "Mutton Stew",
    "Netholi Vazhayilayil Pollichathu",
    "North Malabar Prawns Curry",
    "Pork Peralan",
    "Prawns Masala",
    "Varutharacha Chicken Curry"
 	 		};

 // Selection of the spinner
 Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

 // Application of the Array to the Spinner
 ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, NonVegList);
 spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down vieww
 spinner2.setAdapter(spinnerArrayAdapter);    
    
}
    
} // end class
