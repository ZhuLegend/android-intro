package mg.x261.activitydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView activityListView;

    private String[] activityNames = {"ActivityCheckbox", "ActivityDatePicker", "ActivityDatePickerDialog",
            "ActivityListView", "ActivityProgressBar", "ActivityRadioButton", "ActivityRating",
            "ActivityRunnableThreadHandler", "ActivityScrollView", "ActivitySpinner", "ActivitySwitch",
            "ActivityTimePicker", "LoadImage", "MainButton", "MainCalendarView", "MainDialog",
            "MainEditText", "MainImageView", "MainLinearLayout", "MainRelativeLayout", "MainSeekBar",
            "MainTable", "MainTextView", "MainToast"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1: Find the activity list view in the layout by id (R.id.activity_list_view).

        // TODO 2: Create an array adapter with the activity names and the layout for the item view.

        // TODO 3: Set the adapter to the activity list view.

        // TODO 4:
        //   Set an item click listener for the activity list view.
        //   In the listener, use a switch statement to start the corresponding activity based on the name of the clicked item.

        activityListView = findViewById(R.id.activity_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, activityNames
        );

        activityListView.setAdapter(adapter);

        activityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                intent.setClassName(MainActivity.this, "mg.x261.activitydemo." + activityNames[position]);

                startActivity(intent);
            }
        });
    }
}