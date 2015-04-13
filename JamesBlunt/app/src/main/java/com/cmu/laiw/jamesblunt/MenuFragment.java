package com.cmu.laiw.jamesblunt;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by laiw on 4/7/15.
 */
public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.option_fragment, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
   /* private ListSelectionListener mListener = null;

    // Callback interface that allows this Fragment to notify the MainActivity when
    // user clicks on a List Item
    public interface ListSelectionListener {
        public void onListSelection(int index);
    }

    // Called when the user selects an item from the List
    @Override
    public void onListItemClick(ListView l, View v, int pos, long id) {

        // Indicates the selected item has been checked
        getListView().setItemChecked(pos, true);

        // Inform the QuoteViewerActivity that the item in position pos has been selected
        mListener.onListSelection(pos);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {

            // Set the ListSelectionListener for communicating with the MainActivity
            mListener = (ListSelectionListener) activity;

        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnArticleSelectedListener");
        }
    }




    @Override
    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);

        // Set the list choice mode to allow only one selection at a time
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        // Set the list adapter for the ListView
        // Discussed in more detail in the user interface classes lesson
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                R.layout.option_fragment, MainActivity.optionArray));
    }

*/

}
