package br.com.etechoracio.firebase.holder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.etechoracio.firebase.R;

public class LineHolder extends RecyclerView.ViewHolder {
    private TextView viewNome;
    private ImageButton viewDelete;

    public LineHolder(@NonNull View itemView) {
        super(itemView);

        viewNome = itemView.findViewById(R.id.itemViewNomeBD);
        viewDelete = itemView.findViewById(R.id.btnDelete);
    }
}
