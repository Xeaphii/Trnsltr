package trnsltr.xeamphii.com.trnsltr;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText et_to,et_from;
    Button BtConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_to = (EditText) findViewById(R.id.et_to);
        et_from = (EditText) findViewById(R.id.et_from);
        BtConvert = (Button) findViewById(R.id.bt_convert);
        BtConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et_from.getText().toString();
                String output = Convert(input);
                et_to.setText(output);
            }
        });

    }

    private String Convert(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            switch (c) {
                case 'a':
                    output +='ا';
                    break;
                case 'b':
                    output +='ب';
                    break;
                case 'c':
                    output +='چ';
                    break;
                case 'd':
                    output +='د';
                    break;
                case 'e':
                    output +='ی';
                    break;
                case 'f':
                    output +='ف';
                    break;
                case 'g':
                    output +='گ';
                    break;
                case 'h':
                    output +='ہ';
                    break;
                case 'i':
                    output +='ی';
                    break;
                case 'j':
                    output +='ج';
                    break;
                case 'k':
                    output +='ک';
                    break;
                case 'l':
                    output +='ل';
                    break;
                case 'm':
                    output +='م';
                    break;
                case 'n':
                    output +='ن';
                    break;
                case 'o':
                    output +='و';
                    break;
                case 'p':
                    output +='پ';
                    break;
                case 'q':
                    output +='ک';
                    break;
                case 'r':
                    output +='ر';
                    break;
                case 's':
                    output +='ش';
                    break;
                case 't':
                    output +='ت';
                    break;
                case 'u':
                    output +='ی';
                    break;
                case 'v':
                    output +='و';
                    break;
                case 'w':
                    output +='و';
                    break;
                case 'x':
                    output +='ب';
                    break;
                case 'y':
                    output +='ے';
                    break;
                case 'z':
                    output +='ز';
                    break;
                default:
                   //    output +="";
                    break;
            }
            //Process char
        }
        return output;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
