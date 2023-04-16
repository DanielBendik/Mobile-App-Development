/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                                                             *
 *      CSCI 322/522       Assignment 1        Fall 2022       *
 *                                                             *
 *       Project Name: I Like Android Bendik Daniel            *
 *                                                             *
 *         Class Name: MainActivity.java                       *
 *                                                             *
 *       Developer(s): Daniel Bendik                           *
 *                                                             *
 *           Due Date: 09/02/2022                              *
 *                                                             *
 *            Purpose: Displaying "I like Android"             *
 *                                                             *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package edu.niu.z1938845.ilikeandroidbendikdaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}