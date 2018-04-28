package com.zdy.project.wechat_chatroom_helper.plugins.main.adapter

import android.database.Cursor
import com.gh0u1l5.wechatmagician.spellbook.WechatGlobal
import com.gh0u1l5.wechatmagician.spellbook.util.ReflectionUtil

object Classes {

    val ConversationWithAppBrandListView: Class<*> by WechatGlobal.wxLazy("ConversationWithAppBrandListView") {
        ReflectionUtil.findClassIfExists("${WechatGlobal.wxPackageName}.ui.conversation.ConversationWithAppBrandListView", WechatGlobal.wxLoader)
    }

    val WechatClasses by WechatGlobal.wxLazy("WechatClasses") {
        ReflectionUtil.findClassesFromPackage(WechatGlobal.wxLoader!!, WechatGlobal.wxClasses!!, WechatGlobal.wxPackageName)
    }

    val ClassesByCursor by WechatGlobal.wxLazy("ClassesByCursor") {
        WechatClasses.filterBySuper(Cursor::class.java)
    }


//    val ConversationOnItemClickListener: Class<*> by WechatGlobal.wxLazy("ConversationOnItemClickListener") {
//        ReflectionUtil.findClassesFromPackage(WechatGlobal.wxLoader!!, WechatGlobal.wxClasses!!, "${WechatGlobal.wxPackageName}.ui.conversation")
//                .classes
//                .filter { it.interfaces.contains(AdapterView.OnItemClickListener::class.java) }
//                .filter {
//                    it.fields.filter {
//                        it.type == Activity::class.java
//                    }.firstOrNull {
//                        it.type == ListView::class.java
//                    } == null
//                }
//                .filter {
//                    it.constructors.firstOrNull {
//                        it.parameterTypes.filter {
//                            it.name == Classes.ConversationWithCacheAdapter.name
//                        }.filter {
//                            it.name == ListView::class.java.name
//                        }.firstOrNull {
//                            it.name == Activity::class.java.name
//                        } == null
//                    } == null
//                }
//                .firstOrNull()
//
//    }
}