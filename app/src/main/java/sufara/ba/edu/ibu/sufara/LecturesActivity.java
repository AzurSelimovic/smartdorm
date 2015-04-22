package sufara.ba.edu.ibu.sufara;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;


public class LecturesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectures);




        /*
        try {
            String lectures = loadJSONFromAsset();
            JSONObject obj = new JSONObject(lectures);
            Log.d("obj",obj.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
*/
        String[] lecturesList = {"Lecture one", "Lecture two", "Lecture three", "Lecture four", "Lecture five", "Lecture six", "Lecture seven", "Lecture eight", "Lecture nine", "Lecture ten", "Lecture eleven", "Lecture twelve", "Lecture thirteen", "Lecture fourteen", "Lecture sixteen", "Lecture seventeen","Lecture eighteen", "Lecture nineteen", "Lecture twenty", "Lecture twenty-one", "Lecture twenty-two", "Lecture twenty-three", "Lecture twenty-four", "Lecture twenty-five", "Lecture twenty-six", "Lecture twenty-seven", "Lecture twenty-eight" };
        ListAdapter lecturesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lecturesList);
        ListView listLecturesView = (ListView)findViewById(R.id.listLecturesView);

        listLecturesView.setAdapter(lecturesAdapter);

        listLecturesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(LecturesActivity.this, LectureActiviy.class);
                startActivity(intent);
            }
        });
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {

            InputStream is = getAssets().open("C:\\Users\\Armin Nukic\\AndroidStudioProjects\\Sufara\\app\\src\\main\\res\\lectures.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lectures, menu);
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
