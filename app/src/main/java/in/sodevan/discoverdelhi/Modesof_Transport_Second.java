package in.sodevan.discoverdelhi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Modesof_Transport_Second extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modesof__transport__second);
        textView = (TextView) findViewById(R.id.text_modes);
        Bundle bundle = getIntent().getExtras();
        //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (bundle != null) {
            String val = bundle.getString("Modes of Transport");
            if (val.equalsIgnoreCase("Delhi Metro")) {

                WebView mWebView;
                mWebView=(WebView) this.findViewById(R.id.web_view_modes_of_transport);
                //setSupportActionBar(toolbar);
                mWebView.loadUrl("http://www.delhimetrotimings.in/Images/metromap.png");


                // Enable Javascript
                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                // Force links and redirects to open in the WebView instead of in a browser
                mWebView.setWebViewClient(new WebViewClient());

            }
            else if (val.equalsIgnoreCase("Auto Rickshaw")) {
                textView.setText("Autos are a great way of seeing a city. They are less expensive than taxis and unlike buses," +
                        " they take you to the doorstep of your destination.");

            }
            else if (val.equalsIgnoreCase("Buses")) {
                textView.setText("Autos are a great way of seeing a city. They are less expensive than taxis and unlike buses," +
                        " they take you to the doorstep of your destination.");

            }
            else if (val.equalsIgnoreCase("Cycle Rickshaw")) {
                textView.setText("Autos are a great way of seeing a city. They are less expensive than taxis and unlike buses," +
                        " they take you to the doorstep of your destination.");

            }
            else if (val.equalsIgnoreCase("Cabs")) {
                textView.setText("Autos are a great way of seeing a city. They are less expensive than taxis and unlike buses," +
                        " they take you to the doorstep of your destination.");

            }



        }



    }
}
