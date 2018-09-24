package mowede.framework.ititit.ui.userlist.view

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.net.toUri
import kotlinx.android.synthetic.main.user_item.view.*
import mowede.framework.ititit.R
import mowede.framework.ititit.models.GitUser
import mowede.framework.ititit.util.extension.loadImage

class UserListAdapter(gitUserListItems: MutableList<GitUser>) : RecyclerView.Adapter<UserListAdapter.UserViewHolder>() {

    private val gitUserListItems: MutableList<GitUser> = gitUserListItems
    override fun getItemCount() = gitUserListItems.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) = holder.run{
        clear()
        onBind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) = UserViewHolder(LayoutInflater.from(parent?.context)
            .inflate(R.layout.user_item, parent, false))

    internal fun addUsersToList(GitUsers: List<GitUser>) {
        this.gitUserListItems.addAll(GitUsers)
        notifyDataSetChanged()
    }

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view)  {
        fun clear() {
            itemView.coverImageView.setImageDrawable(null)
            itemView.titleTextView.text = ""
            itemView.contentTextView.text = ""
        }
        fun onBind(position: Int) {
            val (url, avatar_url, home_url) = gitUserListItems[position]

            inflateData(url, home_url, avatar_url)
            setItemClickListener(url)
        }
        private fun setItemClickListener(projectUrl: String?) {
            itemView.setOnClickListener {
                projectUrl?.let {
                    try {
                        // using "apply" as an example
                        itemView.context.startActivity(Intent().apply {
                            action = Intent.ACTION_VIEW
                            data = it.toUri()
                            addCategory(Intent.CATEGORY_BROWSABLE)
                        })
                    } catch (e: Exception) {
                    }
                }
            }
        }
        private fun inflateData(title: String?, description: String?, coverImgUrl: String?) {
            title?.let { itemView.titleTextView.text = it }
            description?.let { itemView.contentTextView.text = it }
            coverImgUrl?.let {
                itemView.coverImageView.loadImage(it)
            }
        }
    }
}