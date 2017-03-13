package in.sodevan.discoverdelhi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Emergency_contacts_second extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts_second);
        textView = (TextView) findViewById(R.id.emergency_second_textview);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String val = bundle.getString("Emergency Areas");
            Log.d("Tag",val);
            if (val.equalsIgnoreCase("New Delhi")) {
                textView.setText("1. Connaught place:\n" +
                        "\n" +
                        "Nearest Hospital: Northern Railway Central Hospital\n" +
                        "\n" +
                        "Address: Basant Ln, Aram Bagh, Connaught Place, New Delhi, Delhi 110055\n" +
                        "\n" +
                        "Phone: 011 2336 4227\n" +
                        "\n" +
                        "Police Station: NDCR Police Station\n" +
                        "\n" +
                        "Address: Sansad Marg, Police Colony, Connaught Place, New Delhi, Delhi 110001\n" +
                        "\n" +
                        "Phone: 011 2336 1100\n" +
                        "\n" +
                        "2. Chanakyapuri:\n" +
                        "\n" +
                        "Nearest Hospital: CGHS Chanakyapuri\n" +
                        "\n" +
                        "Address: D-II/257, 259, Vinay Marg, Chanakyapuri, New Delhi, Delhi 110029\n" +
                        "\n" +
                        "Phone: 011 2412 2518\n" +
                        "\n" +
                        "Police Station: Police Station Chanakyapuri\n" +
                        "\n" +
                        "Address: Teen Murti Marg, Diplomatic Enclave, Chanakyapuri, New Delhi, Delhi 110021\n" +
                        "\n" +
                        "Phone: 011 2301 2003\n" +
                        "\n" +
                        "3. Delhi Cantonment\n" +
                        "\n" +
                        "Nearest Hospital: Delhi Cantonment General Hospital\n" +
                        "\n" +
                        "Address: Sadar Bazar Road, Kabul Lines, Delhi Cantonment, New Delhi, Delhi 110010\n" +
                        "\n" +
                        "Phone: 011 2569 3772\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Sardar Patel Marg, Dhaula Kuan I, Dhaula Kuan Enclave I, Delhi Cantonment, New Delhi, Delhi 110010\n" +
                        "\n" +
                        "Phone: 011 2569 3161\n" +
                        "\n" +
                        "4. Vasant Vihar\n" +
                        "\n" +
                        "Nearest Hospital: Holy Angels Hospital\n" +
                        "\n" +
                        "Address: Plot B, Community Center, Basant Lok, Vasant Vihar, Near Priya Cinema, Behind Vasant Continental Hotel, New Delhi,\n" +
                        "\n" +
                        "Delhi 110057\n" +
                        "\n" +
                        "Phone: 011 4335 7700\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Munirka Enclave, Munirka, New Delhi, Delhi 110067");
            }
            else if (val.equalsIgnoreCase("West Delhi")) {
                textView.setText("1. Rajouri Garden\n" +
                        "\n" +
                        "Nearest Hospital: MKW Hospital\n" +
                        "\n" +
                        "Address: No.J-12, Community Centre, Rajouri Garden, New Delhi, Delhi 110027\n" +
                        "\n" +
                        "Phone: 011 4560 9999\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Vishal Enclave, Vishal Cinema Rd, Block A, Shivaji Place, Rajouri Garden, New Delhi, Delhi 110027\n" +
                        "\n" +
                        "Phone: 011 2545 3990\n" +
                        "\n" +
                        "2. Patel Nagar\n" +
                        "\n" +
                        "Nearest hospital: Sardar Patel Hospital\n" +
                        "\n" +
                        "Address: EAST PATEL NAGAR, New Delhi, Delhi 110008\n" +
                        "\n" +
                        "Phone: 091258 85944\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Patel Rd, Block B, West Patel Nagar, Patel Nagar, New Delhi, Delhi 110008\n" +
                        "\n" +
                        "Phone: 011 2587 4034\n" +
                        "\n" +
                        "3. Punjabi Bagh\n" +
                        "\n" +
                        "Nearest Hospital: Sehra Medical Centre\n" +
                        "\n" +
                        "Address: 29, N W Ave Rd, West Punjabi Bagh, Punjabi Bagh, Delhi, 110026\n" +
                        "\n" +
                        "Phone: 011 4102 1937\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: NH10, Block H, West Punjabi Bagh, Punjabi Bagh, Delhi, 110026\n" +
                        "\n" +
                        "Phone: 011 2522 4162");
            }
            else if (val.equalsIgnoreCase("East Delhi")) {
                textView.setText("1. Preet Vihar\n" +
                        "\n" +
                        "Nearest Hospital: Metro Hospital\n" +
                        "\n" +
                        "Address: 21, Community Centre, Preet Vihar, Delhi, 110092\n" +
                        "\n" +
                        "Phone: 011 4928 6666\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Aditya Arcade, Acharya Nag Raj Marg, Nirman Vihar, C Block, Preet Vihar, Delhi, 110092\n" +
                        "\n" +
                        "2. Mayur Vihar\n" +
                        "\n" +
                        "Nearest Hospital: Kukreja Nursing Home\n" +
                        "\n" +
                        "Address: Acharya Niketan, Mayur Vihar,Phase I, New Delhi, Delhi 1100091\n" +
                        "\n" +
                        "Phone: 011 2275 2690\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Trilok Puri Rd, Himmatpuri, Mayur Vihar Phase 1, New Delhi, Delhi 110091");
            }
            else if (val.equalsIgnoreCase("Central Delhi")) {
                textView.setText("1. Karol Bagh\n" +
                        "\n" +
                        "Nearest Hospital: SGR City Hospital\n" +
                        "\n" +
                        "Address: B-1/1, Pusa Rd, North Extension Area, Karol Bagh, New Delhi, Delhi 110060\n" +
                        "\n" +
                        "Phone: 011 4225 5555\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Ajmal Khan Rd, Beadonpura, Karol Bagh, New Delhi, Delhi 110005\n" +
                        "\n" +
                        "Phone: 011 2872 0482\n" +
                        "\n" +
                        "2. Daryaganj\n" +
                        "\n" +
                        "Nearest Hospital: Kasturba Hospital\n" +
                        "\n" +
                        "Address: Near Jama Masjid, Daryaganj, New Delhi, Delhi 110002\n" +
                        "\n" +
                        "Phone: 011 2327 5023\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Bahadur Shah Zafar Rd, Dariya Ganj, New Delhi, Delhi 110002\n" +
                        "\n" +
                        "Phone: 011 2326 3240\n" +
                        "\n" +
                        "3. Civil Lines\n" +
                        "\n" +
                        "Nearest Hospital: Aruna Asaf Ali Hospital\n" +
                        "\n" +
                        "Address: 5, Rajpur Road, Civil Lines, Near Tis Hazari Court, New Delhi, Delhi 110054\n" +
                        "\n" +
                        "Police station:\n" +
                        "\n" +
                        "Address: New Chandrawal, Civil Lines, Delhi, 110054\n" +
                        "\n" +
                        "Phone: 23818864");
            }
            else if (val.equalsIgnoreCase("South Delhi")) {
                textView.setText("1. Saket\n" +
                        "\n" +
                        "Nearest hospital: Max Super Speciality Hospital\n" +
                        "\n" +
                        "Address: 1,2, Press Enclave Road, Mandir Marg, Saket, New Delhi, Delhi 110017\n" +
                        "\n" +
                        "Phone: 011 2651 5050\n" +
                        "\n" +
                        "Police station:\n" +
                        "\n" +
                        "Address: Near Select Citywalk, New Delhi, Delhi 110017\n" +
                        "\n" +
                        "Phone: 011 2956 1300\n" +
                        "\n" +
                        "2. Hauz Khas\n" +
                        "\n" +
                        "Nearest Hsopital: Fortis healthworld\n" +
                        "\n" +
                        "Address: E-39, Main Market, New Delhi-110017, Hauz Khas, New Delhi, Delhi 110017\n" +
                        "\n" +
                        "Phone: 011 4165 5658\n" +
                        "\n" +
                        "Police Station:\n" +
                        "\n" +
                        "Address: Near Parking, Main Market, Block E, Hauz Khas, New Delhi, Delhi 110016");
            }



        }


    }
}
