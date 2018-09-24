package mowede.framework.ititit.ui.userlist.view

import mowede.framework.ititit.models.GitUser
import mowede.framework.ititit.ui.base.view.MVPView

interface UserListView :MVPView{
    fun displayUserList(users: List<GitUser>?)
    fun openMainActivity()
}