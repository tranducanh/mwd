package mowede.framework.ititit.ui.userlist.view

import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_userlist.*
import mowede.framework.ititit.R
import mowede.framework.ititit.models.GitUser
import mowede.framework.ititit.ui.base.view.BaseActivity
import mowede.framework.ititit.ui.userlist.interactor.UserListIInteractor
import mowede.framework.ititit.ui.userlist.presenter.UserListIPresenter
import javax.inject.Inject

class UserListActivity: BaseActivity(),UserListView {
    @Inject
    internal lateinit var presenter: UserListIPresenter<UserListView, UserListIInteractor>
    @Inject
    internal lateinit var userListAdapter: UserListAdapter
    @Inject
    internal lateinit var layoutManager: LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userlist)
        presenter.onAttach(this)
    }

    override fun onFragmentDetached(tag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun displayUserList(users: List<GitUser>?) {
        users?.let {
            userListAdapter.addUsersToList(it)
        }
    }

    override fun onFragmentAttached() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }
    override fun openMainActivity() {
        finish()
    }
    fun setUp()
    {
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        repo_recycler_view.layoutManager = layoutManager
        repo_recycler_view.itemAnimator = DefaultItemAnimator()
        repo_recycler_view.adapter = userListAdapter
        presenter.doShowListUser()
    }
}