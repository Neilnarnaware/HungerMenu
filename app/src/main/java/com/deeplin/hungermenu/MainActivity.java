package com.deeplin.hungermenu;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    GridView grid1,grid2,grid3;
    SearchView search;
    TextView txt,txt1,txt2,txt3,txt4;
    FloatingActionButton fab2,fab3;
    LinearLayout overlay;
    ImageView imgv;
    CheckBox checkbox;
    RelativeLayout fabb;
    int q=0;
    int r=0;
    String[] names={"Espresso","Affogato","Cafe Latte","Cappuccino","Double Espresso","Flat White","Long Black","Long Macchiato","Mocca","Piccolo Latte",
            "Ristretto","Short Macchiato","Shakerato","Caffeine-fix-la-cone","Chocolate Frappe","Cafe Miel"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid1 = (GridView) findViewById(R.id.grid1);
        grid2 = (GridView) findViewById(R.id.grid2);
        grid3=(GridView)findViewById(R.id.grid3);
        search = (SearchView) findViewById(R.id.search);
        txt=(TextView)findViewById(R.id.txt);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        imgv = (ImageView) findViewById(R.id.imgv);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);
        checkbox = (CheckBox) findViewById(R.id.checkbox);
        checkbox.setChecked(false);
        overlay = (LinearLayout) findViewById(R.id.overlay);
        fabb=(RelativeLayout)findViewById(R.id.fabb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setSupportActionBar(toolbar);
        }
        grid1.setAdapter(new ImageAdapter(this));
        grid2.setAdapter(new ImageAdapter2(this));
        grid3.setVisibility(View.INVISIBLE);
        final ArrayAdapter<String>adapter;

        grid1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getId() == R.id.grid1) {
                    switch (position) {
                        case 0: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Espresso (Short Black)\n");
                            txt3.setText(
                                    "\n" +
                                            "The espresso (aka “short black”) is the foundation and the most important part to every espresso based drink. So much so that we’ve written a guide on how to make the perfect espresso shot. But for the purposes of this post an espresso consists of:\n" +
                                            "\n" +
                                            "• 1 Shot of espresso in an espresso cup");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            r = 1;
                            q++;
                            break;

                        }
                        case 1: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Affogato\n");
                            txt3.setText(
                                    "\n" +
                                            "An affogato is a simple dessert coffee that is treat during summer and after dinner. It is made by placing one big scoope of vanilla ice cream within a single or double shot of espresso:\n" +
                                            "\n" +
                                            "• Add one scoop of vanilla ice-cream into a tumbler glass milk\n" +
                                            "• Pour a single or double shot of espresso over the vanilla ice-cream");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 2: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Café Latte\n");
                            txt3.setText(
                                    "\n" +
                                            "A café latte, or “latte” for short, is an espresso based drink with steamed milk and micro-foam added to the coffee. This coffee is much sweeter compared to an espresso due to the steamed milk. It is made as follows:\n" +
                                            "\n" +
                                            "• Extract 1 shot of espresso into a tumbler glass\n" +
                                            "• Add steamed milk\n" +
                                            "• 1cm of micro-foam on top of the steamed milk");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);

                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 3: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Cappuccino\n");
                            txt3.setText(
                                    "\n" +
                                            "A cappuccino is similar to a latte. However the key difference between a latte and cappuccino is that a cappuccino has more foam and chocolate placed on top of the drink. Further a cappuccino is made in a cup rather than a tumbler glass. It is made as follows:\n" +
                                            "\n" +
                                            "• Extract 1 shot of espresso into a cup\n" +
                                            "• Add steamed milk\n" +
                                            "• Add 2-3cm of micro-foam on top of the steamed milk\n" +
                                            "• Sprinkle chocolate on top of the coffee");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 4: {
                            overlay.setVisibility(View.INVISIBLE);
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Double Espresso (Doppio)\n");
                            txt3.setText(
                                    "\n" +
                                            "A double espresso (aka “Doppio”) is just that, two espresso shots in one cup. Therefore a double espresso consists of:\n" +
                                            "\n" +
                                            "• 2 shots of espresso in an espresso cup");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 5: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Flat White\n");
                            txt3.setText(
                                    "\n" +
                                            "A flat white is a coffee you’ll primarily find in Australia and New Zealand. It is made the same as a cappuccino expect it does not have any foam or chocolate on top. It is made like this:\n" +
                                            "\n" +
                                            "• 1 shot of espresso into a cup\n" +
                                            "• Add steamed milk into the cup but no micro-foam");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 6: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Long Black (Americano)\n");
                            txt3.setText(
                                    "\n" +
                                            "A long black (aka “americano”) is hot water with an espresso shot extracted on top of the hot water. It is made as follows:\n" +
                                            "\n" +
                                            "• Fill a cup with 2/3rds full of hot water\n" +
                                            "• Extract 1 shot of espresso over the hot water");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 7: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Long Macchiato\n");
                            txt3.setText(
                                    "\n" +
                                            "A long macchiato is the same as a short macchiato but with a double shot of espresso. The same rule of thirds applies in the traditionally made long macchiato:\n" +
                                            "\n" +
                                            "• 2 shots of espresso in a tumbler glass or cup\n" +
                                            "• A dollop of steamed milk and foam placed on top of the espresso");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 8: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Mocha\n");
                            txt3.setText(
                                    "\n" +
                                            "A mocha is a mix between a cappuccino and a hot chocolate. It is made by putting mixing chocolate powder with an espresso shot and then adding steamed milk and micro-foam into the beverage. The steps are as follows:\n" +
                                            "\n" +
                                            "• Extract 1 shot of espresso into a cup\n" +
                                            "• Add one spoon of chocolate powder into the espresso shot and mix\n" +
                                            "• Add steamed milk\n" +
                                            "• Add 2-3cm of micro-foam\n" +
                                            "• Sprinkle chocolate powder on top");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 9: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Piccolo Latte\n");
                            txt3.setText(
                                    "\n" +
                                            "A piccolo latte is a café latte made in an espresso cup. This means it has a very strong but mellowed down espresso taste thanks to the steamed milk and micro foam within it. There are two ways of making a piccolo latte, with either 1 espresso shot or 1 ristretto shot:\n" +
                                            "\n" +
                                            "• 1 shot of espresso or 1 ristretto shot of espresso in a espresso cup\n" +
                                            "• Add steamed milk and small amount of micro-foam.");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 10: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Ristretto\n");
                            txt3.setText(
                                    "\n" +
                                            "A ristretto is an espresso shot that is extracted with the same amount of coffee but half the amount of water. The end result is a more concentrated and darker espresso extraction. It is made as follows:\n" +
                                            "\n" +
                                            "• Extract a standard espresso shot with half the amount of water.\n" +
                                            "• Alternatively turn off a normal espresso extraction before the espresso starts to blonde.");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 11: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Short Macchiato\n");
                            txt3.setText(
                                    "\n" +
                                            "A short macchiato is similar to an espresso but with a dollop of steamed milk and foam to mellow the harsh taste of an espresso. You will find that baristas in different countries make short macchiatos differently. However the traditional way of making a short macchiato is as follows:\n" +
                                            "\n" +
                                            "• 1 Shot of espresso in a short glass or espresso cup\n" +
                                            "• A dollop of steamed milk and foam placed on top of the espresso");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 12: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Shakerato (shock-eh-RAH-toe)\n");
                            txt3.setText(
                                    "\n" +
                                            "Hot caffè shaken with ice to chill it quickly.Make the same way as Caffè Shakerato but sweeten with Italian almond syrup, known in Italy as latte di mandorla (not be confused with American-style almond milk). " +
                                            "\n" +
                                            "Orgeat syrup is similar to almond syrup, but some versions include a bit of orange or rose essence.");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 13: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Caffeine-fix-la-cone\n");
                            txt3.setText(
                                    "\n" +
                                            "These coffee confections feature a patented chocolate-lined cone that’s coated with four different types of chocolate compounds on the inside to prevent the coffee from leaking."
                                            + "\n");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 14: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Chocolate Frappe\n");
                            txt3.setText(
                                    "\n"
                                            + "Made with organic chocolate, organic milk and whizzed together with our frozen frappe mix that’s topped with optional whipped cream." +
                                            "\n" + " For an extra treat, ask the Brrr-ista for a shot of caramel, hazelnut or vanilla for an indulgent ice-cold frappe freshly made to order. ");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 15: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Café Miel");
                            txt3.setText(
                                    "\n"
                                            + "This has a shot of espresso, steamed milk, cinnamon, and honey.  The name comes from the Spanish word for honey, miel.");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                    }
                }
            }
        });

        grid2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getId() == R.id.grid2) {
                    switch (position) {
                        case 0: {

                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Blue Mountain\n");
                            txt3.setText("Jamaican Blue Mountain Coffee or Jamaica Blue Mountain Coffee is a classification of coffee grown in the Blue Mountains of Jamaica. The best lots of Blue Mountain coffee are noted for their mild flavour and lack of bitterness. Over the past few decades, this coffee has developed a reputation that has made it one of the most expensive and sought-after coffees in the world. Over 80% of all Jamaican Blue Mountain Coffee is exported to Japan. the beans are the flavor base of Tia Maria coffee liqueur");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 1: {

                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("Kilimanjaro\n");
                            txt3.setText(
                                    "\n" +
                                            "Mount Kilimanjaro is located along the northern border of Tanzania, practically within shouting distance of Kenya. So, of course, our Kilimanjaro Blend is going to be a brilliant combination of quality African beans. A fine blend of Light Roast African coffee beans featuring a full body and mild acidity, this blend offers a soft, sweet undertone with a mild sharpness");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 2: {

                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" New York\n");
                            txt3.setText(
                                    "\n" +
                                            "Coffee is slightly acidic and can have a stimulating effect on humans because of its caffeine content. Coffee is one of the most popular drinks in the world.[3] It can be prepared and presented in a variety of ways (e.g., espresso, French press, cafe latte, etc.). It is usually served hot, although iced coffee is also served");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 3: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Italian Espresso\n");
                            txt3.setText(
                                    "\n" +
                                            "    Espresso is recognised throughout the world as the quintessential Italian coffee.\n" +
                                            "full body and intense aroma are the result of the coffeemaker’s pressure extraction system.\n" +
                                            "Nowadays, domestic espresso coffeemakers enable many Italians to experience each day how the alchemy between the four basic elements — water, temperature, pressure and coffee ");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 4: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Milano\n");
                            txt3.setText(
                                    "\n" +
                                            "    he legacy of Vancouver based Milano Coffee’s artisan tradition dates back three generations of Italian coffee heritage blended with over thirty years of West Coast culture. In 1984 visionary founder and Master Roaster, Francesco Curatolo, brought 75 years of Italian roasting and blending expertise to Vancouver, Canada garnering a worldwide reputation for his exquisitely crafted Italian coffees. ");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 5: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText("New Orleans\n");
                            txt3.setText(
                                    "\n" +
                                            "    The taste for coffee and chicory was developed by the French during their civil war. Coffee was scarce during those times, and they found that chicory added body and flavor to the brew. The Acadians from Nova Scotia brought this taste and many other french customs (heritage) to Louisiana. Chicory is the root of the endive plant. Endive is a type of lettuce.");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 6: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Fuse\n");
                            txt3.setText(
                                    "\n" +
                                            "   High quality coffee beans, a brewing system matched to your own personal taste and a good grinder to pull the two together. Purchasing green coffee beans and roasting them at home is the surest way to get exceptionally fresh coffee roasted just the way you like it. Raw coffee has a longer shelf life than roasted coffee");

                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 7: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Original Blend\n");
                            txt3.setText(
                                    "\n" +
                                            "   A medium roast blend, expertly roasted with care to deliver a perfect balance and the unique Tim Hortons taste that has made it Canada's Favourite Coffee.");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 8: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Coffee from Nilgiris (Tamil Nadu)\n");
                            txt3.setText(
                                    "\n" +
                                            "    Elevation: 900-1400 m MSL\n" +
                                            "    Rainfall: 1600-2600 mm\n" +
                                            "    Main coffee types: Arabica, Robusta\n" +
                                            "    Total area under coffee: Arabica - 3,600 ha, Robusta - 4,000 ha\n" +
                                            "    Average production: Arabica - 1,400 MT, Robusta - 2,800 MT\n" +
                                            "    Main varieties: Arabica - S.795, Kents, Cauvery Robusta - Peridenia, S.274, CxR");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                        case 9: {
                            overlay.setVisibility(View.VISIBLE);
                            txt4.setText(" Coffee from Wayanaad (Kerala)\n");
                            txt3.setText(
                                    "\n" +
                                            "    Elevation: 600-900 m MSL\n" +
                                            "    Rainfall: 1100-1200 mm\n" +
                                            "    Main coffee type: Robusta\n" +
                                            "    Total area under coffee: 67,000 ha\n" +
                                            "    Average production: 54,000 MT\n" +
                                            "    Main varieties: Peridenia, S.274, CxR");
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    overlay.setVisibility(View.INVISIBLE);
                                    if (checkbox.isChecked()) {
                                        Toast.makeText(getApplicationContext(), "Select the coffee icon below to confirm the coffee and beans", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }, 3000);
                            q++;
                            r = 1;
                            break;
                        }
                    }
                }

            }
        });

        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your coffee has been added for billing", Toast.LENGTH_SHORT).show();
            }
        });
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your order has been canceled", Toast.LENGTH_SHORT).show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your bill is being generated", Toast.LENGTH_LONG).show();
            }
        });
        grid1.setOnScrollListener(new AbsListView.OnScrollListener(){
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount)
            {
                if(firstVisibleItem + visibleItemCount >= totalItemCount){
                    grid2.setVisibility(View.VISIBLE);
                    txt.setVisibility(View.VISIBLE);

                }
                else{
                    grid2.setVisibility(View.INVISIBLE);
                    txt.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState){

            }
        });
        search.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid1.setVisibility(View.GONE);
                grid2.setVisibility(View.GONE);
                grid3.setVisibility(View.VISIBLE);
                fabb.setVisibility(View.GONE);
                txt.setVisibility(View.GONE);
            }

        });
        search.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                grid1.setVisibility(View.VISIBLE);
                grid2.setVisibility(View.VISIBLE);
                grid3.setVisibility(View.INVISIBLE);
                fabb.setVisibility(View.VISIBLE);
                txt.setVisibility(View.INVISIBLE);
                return false;
            }
        });
        adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,names);
        grid3.setAdapter(adapter);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {

                adapter.getFilter().filter(query);
                return true;
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public void onBackPressed() {
       if(r==1){
           Intent intent=new Intent(getApplicationContext(),MainActivity.class);
           startActivity(intent);
       }

        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.aboutus) {
            Toast.makeText(this, "We are situates on the banks of Ganga River." +
                    "We also use the best coffee beans available", Toast.LENGTH_SHORT).show();

            return true;
        }
         if(id==R.id.Contactus){
            Toast.makeText(this, "Follow us - www.cafebeans.com", Toast.LENGTH_SHORT).show();
        return  true;
        }
         if(id==R.id.help){
            Toast.makeText(this, "Click on the coffee you desire and select the beans and finally click the coffee icon below to confirm the order", Toast.LENGTH_SHORT).show();
        return  true;
        }


        return super.onOptionsItemSelected(item);
    }
}
