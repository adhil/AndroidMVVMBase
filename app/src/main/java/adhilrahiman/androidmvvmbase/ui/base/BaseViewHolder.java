package adhilrahiman.androidmvvmbase.ui.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**                                         \\\\//
 * THe less interesting codes of ViewHolder \z z/
 *                                           -\-
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void onBind(int position);
}
