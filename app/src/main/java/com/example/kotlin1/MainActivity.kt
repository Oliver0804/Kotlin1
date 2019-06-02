package com.example.kotlin1

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    private var currentNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        setupView()

        ankoLayout()

    }
    private fun ankoLayout(){
        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                textSize = 26f
            }
        }
    }

    private fun setupView() {

        // Tap Button
        button.setOnClickListener{
            currentNumber += 1
            textView2.text = currentNumber.toString()
            toast("olivezr test long Toast")
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.menuInflater.inflate(R.menu.menu_main, menu)
        for (i in 0..4) {
            menu.add(Menu.NONE, Menu.FIRST + i, Menu.NONE, "Item " + Integer.toString(i + 1))
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if(item.getGroupId() == Menu.NONE) {
            //Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
