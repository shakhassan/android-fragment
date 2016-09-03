package example.my.hellolayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rjirwanshah on 03/09/2016.
 */
public class HelloFragment extends Fragment {

    private TextView mMessageTextView;
    private Button mHelloButton;
    private Button mByeButton;

    public HelloFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.hello_fragment, container, false);

        mMessageTextView = (TextView) rootView.findViewById(R.id.hello_fragment_tv_message);
        mHelloButton = (Button) rootView.findViewById(R.id.button_hello);
        mByeButton = (Button) rootView.findViewById(R.id.button_bye);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mHelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMessageTextView.setText("Hello there!");
            }
        });

        mByeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMessageTextView.setText("Bye!");
            }
        });
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        mMessageTextView.setText("Hello World");
//    }
}
