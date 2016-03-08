package gdg.com.datetest;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;
    //private TimePicker timePicker;
    private Calendar cal;
    private int year;
    private int month;
    private int day;
    //private int hour;
    //private int minute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//获取一个日历对象
        cal = Calendar.getInstance();
//获取年月日时分秒的信息
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        //hour = cal.get(Calendar.HOUR_OF_DAY);
        // minute = cal.get(Calendar.MINUTE);
        //setTitle(year + "-" + month + "-" + day);
        datePicker = (DatePicker) findViewById(R.id.datePicker1);
        //timePicker = (TimePicker) findViewById(R.id.timePicker1);

//datePicker初始化
        datePicker.init(year, cal.get(Calendar.MONTH), day, new DatePicker.OnDateChangedListener() {

            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear,
                                      int dayOfMonth) {
// TODO Auto-generated method stub
                //setTitle(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
            }
        });

//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//
//                setTitle(hourOfDay + ":" + minute);
//            }
//        });
//        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear,
//                                  int dayOfMonth) {
//
//                setTitle(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
//            }
//        }, year, cal.get(Calendar.MONTH), day).show();

//        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
//
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//
//                setTitle(hourOfDay + ":" + minute);
//            }
//        }, hour, minute, true).show();
    }
}
