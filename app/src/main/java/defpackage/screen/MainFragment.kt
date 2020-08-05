package defpackage.screen

import android.os.Bundle
import android.view.View
import com.mstyletlt.screen.base.BaseFragment

class MainFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

    companion object {

        fun newInstance(): MainFragment {
            return MainFragment().apply {
                arguments = Bundle().apply {
                }
            }
        }
    }
}