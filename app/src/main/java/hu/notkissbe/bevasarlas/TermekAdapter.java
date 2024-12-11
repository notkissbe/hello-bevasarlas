package hu.notkissbe.bevasarlas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TermekAdapter extends BaseAdapter {

    private Context context;
    private List<Termek> termekList;

    public TermekAdapter(Context context, List<Termek> termekList) {
        this.context = context;
        this.termekList = termekList;
    }

    @Override
    public int getCount() {
        return termekList.size();
    }

    @Override
    public Object getItem(int position) {
        return termekList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        if(convertView == null){
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        Termek termek = termekList.get(position);

        TextView nevText = convertView.findViewById(R.id.nevText);
        TextView mennyisegText = convertView.findViewById(R.id.mennyisegText);
        TextView darabArText = convertView.findViewById(R.id.darabArText);
        TextView kategoriaText = convertView.findViewById(R.id.kategoriaText);

        nevText.setText(termek.getNev());
        mennyisegText.setText(termek.getMennyiseg());
        darabArText.setText(termek.getDarab_ar());
        kategoriaText.setText(termek.getKategoria());

        return convertView;
    }
}
