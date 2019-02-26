package sinc.com.httplab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.serverBtn)).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                httpWeb();
            }
        }) ;
    }

    public void httpWeb(){
        // 아래는 우리꺼 아이피(ipconfg해서 ipv 4 의 주소) 우리꺼 프로젝트 우리꺼 .do 로 바꿔주면 된다.
        String SERVER_URL="http://10.149.179.245:8088/user/android.do"; // 서버 주소

        // httpUtil이 asynctask이다. asynctasg 상속받고 있으니까.

        HttpUtil hu = new HttpUtil(MainActivity.this);
        String[] params = {SERVER_URL, "id:user", "pwd:user" } ;
        // execute함수가 돌아가면 doinbackground가 실행되고 있는 것이다.
        hu.execute(params);
    }

    public void printToast(String rtn){
        Toast.makeText(MainActivity.this,rtn, Toast.LENGTH_SHORT).show();
    }
}
