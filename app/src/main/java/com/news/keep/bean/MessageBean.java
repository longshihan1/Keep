package com.news.keep.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/5/20 0020 下午 2:48
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class MessageBean {

    /**
     * ok : true
     * data : {"_id":"573dda12bc0ccfc9055a9d02","content":"接下来是一场与地球引力的恶战，你准备好了吗 #我要上精选#
     * #我的日常健身#","photo":"http://static1.gotokeep
     * .com/picture/2016/05/19/23/720142b0c1b420a4cd0b756e917c5813ef76b977.jpg",
     * "author":{"_id":"54fe6e5c944fd9ce2dafc97a","id":"54fe6e5c944fd9ce2dafc97a",
     * "created":"2015-03-10T04:09:00.000Z","username":"Eric董","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/03/10/ed0d24ffd53ca350fd046a3fda215b2bb8d06201.jpg","gender":"M"},
     * "__v":0,"modified":"2016-05-19T15:21:54.644Z","stateValue":30,"state":"hot",
     * "achievements":[],"viewCount":1,"favoriteCount":19,"contentType":["text","photo"],
     * "type":"direct","geo":[],"noise":false,"public":true,"likes":294,"comments":30,
     * "meta":{"name":" 新版功能 ","count":1},"created":"2016-05-19T15:21:54.000Z",
     * "id":"573dda12bc0ccfc9055a9d02","commentsList":[{"__v":"0","content":"帅",
     * "author":{"_id":"56073d1d1969f3a8ab6fdcfa","id":"56073d1d1969f3a8ab6fdcfa",
     * "created":"2015-09-27T00:49:33.000Z","username":"信仰ii蜕变","avatar":""},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 09:08:05
     * GMT+0800 (CST)","_id":"573e637546054cc85d4663e5","stateValue":20,"state":"normal",
     * "created":"2016-05-20T01:08:05.000Z","id":"573e637546054cc85d4663e5"},{"__v":"0",
     * "content":"美！","author":{"_id":"56ab0b592da443fc473619b5","id":"56ab0b592da443fc473619b5",
     * "created":"2016-01-29T06:48:57.000Z","username":"Cesar凯撒","avatar":"http://static1
     * .gotokeep.com/avatar/2016/02/10/18/2506ba659f002de2141a42c8ff87c6f3b1dc36f1.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 09:06:27
     * GMT+0800 (CST)","_id":"573e631335a5fdc46143c5d9","stateValue":20,"state":"normal",
     * "created":"2016-05-20T01:06:27.000Z","id":"573e631335a5fdc46143c5d9"},{"__v":"0",
     * "content":"董老大身高体重多少啊？","author":{"_id":"561b72239fe26b8059938e9d",
     * "id":"561b72239fe26b8059938e9d","created":"2015-10-12T08:41:07.000Z","username":"南昌九戒",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2015/10/22/11/d77fa2b929ea3d61dd863372fe54133b793417bd.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:59:14
     * GMT+0800 (CST)","_id":"573e61624e540bac611913d7","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:59:14.000Z","id":"573e61624e540bac611913d7"},{"__v":"0",
     * "content":"要不你加我QQ吧 在这里也说不清楚2678518160","reply":"573e5af0047c5bb83c734f20",
     * "author":{"_id":"573dd23501238b22057104c4","id":"573dd23501238b22057104c4",
     * "created":"2016-05-19T14:48:21.000Z","username":"Yam23","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:49:11
     * GMT+0800 (CST)","_id":"573e5f07aa65bcac3cca1b5f","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:49:11.000Z","id":"573e5f07aa65bcac3cca1b5f",
     * "replyComment":{"author":{"_id":"56a9a0e972dccec047416f79",
     * "id":"56a9a0e972dccec047416f79","created":"2016-01-28T05:02:33.000Z",
     * "username":"sorrow_wb","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/19/20/d5b3b2bdee08581d656a4a11739051c505e1a99d.jpg"},
     * "content":"怎么改造啊"}},{"__v":"0","modified":"Fri May 20 2016 08:37:02 GMT+0800 (CST)",
     * "stateValue":20,"id":"573e5c2e085a96843c4f71b1","refe":"573dda12bc0ccfc9055a9d02",
     * "author":{"_id":"570fdfe3b54df6610dfe12c2","id":"570fdfe3b54df6610dfe12c2",
     * "created":"2016-04-14T18:22:27.000Z","username":"MANYSI-R","avatar":"http://static1
     * .gotokeep.com/avatar/2016/04/06/15/d6be17f2759f1da5555a484fa24c1eff96770d3d.jpg"},
     * "content":"哥们： 蛋白粉一般什么时候吃？？ 看说明每日一次，每次10g   到有些朋友每天吃很多。那么到底每天吃多少？什么时候吃？？非常感谢。",
     * "state":"normal","refe_type":"entry","_id":"573e5c2e085a96843c4f71b1",
     * "created":"2016-05-20T00:37:02.000Z"},{"__v":"0","content":"怎么改造啊",
     * "reply":"573e5850b02254943c8f3904","author":{"_id":"56a9a0e972dccec047416f79",
     * "id":"56a9a0e972dccec047416f79","created":"2016-01-28T05:02:33.000Z",
     * "username":"sorrow_wb","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/19/20/d5b3b2bdee08581d656a4a11739051c505e1a99d.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:31:44
     * GMT+0800 (CST)","_id":"573e5af0047c5bb83c734f20","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:31:44.000Z","id":"573e5af0047c5bb83c734f20",
     * "replyComment":{"author":{"_id":"573dd23501238b22057104c4",
     * "id":"573dd23501238b22057104c4","created":"2016-05-19T14:48:21.000Z","username":"Yam23",
     * "avatar":"http://q.qlogo.cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},
     * "content":"夏天到了，我的鸡皮肤终于改善好了，我的短裤，我的短裙😍"}},{"__v":"0","content":"蛋白粉哪种好呢？？？？",
     * "author":{"_id":"57359153f2936f9b3665fde0","id":"57359153f2936f9b3665fde0",
     * "created":"2016-05-13T08:33:23.000Z","username":"小猪猪88888","avatar":"http://wx.qlogo
     * .cn/mmopen/qWQDYs6XzWtVibRj5EMTo6Zp1UqISB6GTJaiaAH694bVTgt1XwUgW9WX84fQSMB4TB886EGjbMrH4kiaGlDTsrU11Xx9QTcUMaw/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:26:15 GMT+0800 (CST)","_id":"573e59a7a5f6cabd05b44b3a","stateValue":20,"state":"normal","created":"2016-05-20T00:26:15.000Z","id":"573e59a7a5f6cabd05b44b3a"},{"__v":"0","modified":"Fri May 20 2016 08:20:32 GMT+0800 (CST)","stateValue":20,"id":"573e5850b02254943c8f3904","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"573dd23501238b22057104c4","id":"573dd23501238b22057104c4","created":"2016-05-19T14:48:21.000Z","username":"Yam23","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},"content":"夏天到了，我的鸡皮肤终于改善好了，我的短裤，我的短裙😍","state":"normal","refe_type":"entry","_id":"573e5850b02254943c8f3904","created":"2016-05-20T00:20:32.000Z"},{"__v":"0","content":"👍👍","author":{"_id":"55aa6d786f6a4afedcd1e62c","id":"55aa6d786f6a4afedcd1e62c","created":"2015-07-18T15:15:04.000Z","username":"爱屋及乌1224","avatar":"http://static1.gotokeep.com/avatar/2016/01/13/17/4a8f40d6c966002c1a7d7b7afce1fc81dbd5d0c9.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:17:39 GMT+0800 (CST)","_id":"573e57a322fcaba0610a7100","stateValue":20,"state":"normal","created":"2016-05-20T00:17:39.000Z","id":"573e57a322fcaba0610a7100"},{"__v":"0","refe":"573dda12bc0ccfc9055a9d02","created":"2016-05-20T00:12:17.000Z","id":"573e5661085a96843c4f6387","content":"在保证营养全面均衡的前提下，控制摄入热量，加上适当的运动","author":{"_id":"56c5a90dbb119a2705fdd8d0","id":"56c5a90dbb119a2705fdd8d0","created":"2016-02-18T11:20:45.000Z","username":"kbl_lihao","avatar":"http://static1.gotokeep.com/avatar/2016/03/24/21/d8e300063b36b8b7a7da22e49d5fe6e44638c149.jpg"},"state":"normal","_id":"573e5661085a96843c4f6387","stateValue":20,"refe_type":"entry","modified":"Fri May 20 2016 08:12:17 GMT+0800 (CST)","reply":"573e4ee1aa2a06b1205f9631","replyComment":{"author":{"_id":"5672083d602f07e787c7d06d","id":"5672083d602f07e787c7d06d","created":"2015-12-17T00:56:29.000Z","username":"前往一百八","avatar":"http://static1.gotokeep.com/avatar/2016/01/14/22/9c10ad03d1aad971413ff81371a0ec85dc616e75.jpg"},"content":"请问一下，到瓶颈期，体重一直在180左右，怎么办？"}},{"_id":"573e506d047c5bb83c733122","content":"要上天？","author":{"_id":"555f1d6192e80e7464383729","id":"555f1d6192e80e7464383729","created":"2015-05-22T12:13:21.000Z","username":"veelor","avatar":"http://static1.gotokeep.com/avatar/2016/02/31/22/117c3b220638f6d32f8bed545a3ac71345e64f45.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:46:53 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:46:53.000Z","id":"573e506d047c5bb83c733122"},{"_id":"573e4fc24915d6ac5ddefd63","content":"乜勇哦现在雨下一整晚惊恐万状因为我进步","author":{"_id":"563f83d0866531bc80c6a175","id":"563f83d0866531bc80c6a175","created":"2015-11-08T17:18:08.000Z","username":"达达兔兔","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEIwLY76YibxKhEWichibCibfLCCl2wvSr3He4ib2IGnqHlyr8lUNVvg4iaBlTW4hNQnzliaOUSKf4qPan4gGNEldTEKkZVgZAnficJy3p8/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:44:02 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:44:02.000Z","id":"573e4fc24915d6ac5ddefd63"},{"stateValue":20,"content":"请问一下，到瓶颈期，体重一直在180左右，怎么办？","created":"2016-05-19T23:40:17.000Z","__v":"0","_id":"573e4ee1aa2a06b1205f9631","state":"normal","refe_type":"entry","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"5672083d602f07e787c7d06d","id":"5672083d602f07e787c7d06d","created":"2015-12-17T00:56:29.000Z","username":"前往一百八","avatar":"http://static1.gotokeep.com/avatar/2016/01/14/22/9c10ad03d1aad971413ff81371a0ec85dc616e75.jpg"},"id":"573e4ee1aa2a06b1205f9631","modified":"Fri May 20 2016 07:40:17 GMT+0800 (CST)"},{"stateValue":20,"content":"好西木哦，！我才刚刚起步不知何时才有效果啊😊","created":"2016-05-19T23:04:57.000Z","__v":"0","_id":"573e4699b0197590613feb47","state":"normal","refe_type":"entry","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"5735055b2d1221550942f82e","id":"5735055b2d1221550942f82e","created":"2016-05-12T22:36:11.000Z","username":"持枪荡群雌","avatar":""},"id":"573e4699b0197590613feb47","modified":"Fri May 20 2016 07:04:57 GMT+0800 (CST)"},{"_id":"573e45a749eb01d5055ed855","content":"手动赞，加油。求互粉！btw，已加微信。关注下","author":{"_id":"56f325d1164ceebb4168ea23","id":"56f325d1164ceebb4168ea23","created":"2016-03-23T23:25:05.000Z","username":"健康的赵钱孙","avatar":"http://static1.gotokeep.com/avatar/2016/05/13/22/8b9f08c7b8abf83efd2d069c918ffad313ff73a9.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:00:55 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:00:55.000Z","id":"573e45a749eb01d5055ed855"},{"_id":"573e3abab0197590613fc731","content":"肌肉很棒","author":{"_id":"56d3a51013d2dd400ffeffa5","id":"56d3a51013d2dd400ffeffa5","created":"2016-02-29T01:55:28.000Z","username":"Johnnylee2016","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaELaonPSPdD0IEQReRKia35xFrHcMcGyDSh41Xt0h0m3r4UazJNrIH1O5MzewDia30ajKJJCdBpBeT1A/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 06:14:18 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T22:14:18.000Z","id":"573e3abab0197590613fc731"},{"_id":"573e2da6b0197590613fb943","content":"我叫不忘初心，你叫傻子长大，各人叫法不同啊","reply":"573e2901088193603cec631a","author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 05:18:30 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T21:18:30.000Z","id":"573e2da6b0197590613fb943","replyComment":{"author":{"_id":"55969ed32e034f0c21d77173","id":"55969ed32e034f0c21d77173","created":"2015-07-03T14:40:19.000Z","username":"怪蝎子","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"},"content":"你是说，傻子长大了呗！"}},{"_id":"573e2901088193603cec631a","content":"你是说，傻子长大了呗！","reply":"573df162491e55783cde3c0c","author":{"_id":"55969ed32e034f0c21d77173","id":"55969ed32e034f0c21d77173","created":"2015-07-03T14:40:19.000Z","username":"怪蝎子","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 04:58:41 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T20:58:41.000Z","id":"573e2901088193603cec631a","replyComment":{"author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"content":"万磁王，我准备好了！经过十二年的不断艰苦训练和苦苦坚持，我终于从一个懵懂无知天真可爱的少年，成长成了一个懵懂无知天真可爱的青年！😳🔥🔥🔥"}},{"__v":"0","modified":"Fri May 20 2016 01:01:22 GMT+0800 (CST)","stateValue":20,"id":"573df162491e55783cde3c0c","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"content":"万磁王，我准备好了！经过十二年的不断艰苦训练和苦苦坚持，我终于从一个懵懂无知天真可爱的少年，成长成了一个懵懂无知天真可爱的青年！😳🔥🔥🔥","state":"normal","refe_type":"entry","_id":"573df162491e55783cde3c0c","created":"2016-05-19T17:01:22.000Z"},{"state":"normal","reply":"573ddc0401e2ff2d05d6b38f","author":{"_id":"564f42d01befd6eb76fbd2e4","id":"564f42d01befd6eb76fbd2e4","created":"2015-11-20T15:57:04.000Z","username":"蜡笔小新爱啊啊","avatar":"http://static1.gotokeep.com/avatar/2015/10/21/23/8bafae801744a3bbc4e43a4ff54ff6869404a6aa.jpg"},"refe":"573dda12bc0ccfc9055a9d02","__v":"0","content":"镁粉，防汗防滑。一般体操运动还有大运动健身都用","id":"573de8fd664fa03f0583eae3","stateValue":20,"created":"2016-05-19T16:25:33.000Z","refe_type":"entry","modified":"Fri May 20 2016 00:25:33 GMT+0800 (CST)","_id":"573de8fd664fa03f0583eae3","replyComment":{"author":{"_id":"55c1a84bd1d082638f718c4e","id":"55c1a84bd1d082638f718c4e","created":"2015-08-05T06:08:11.000Z","username":"傲娇傲娇小个子","avatar":"http://static1.gotokeep.com/avatar/2016/01/18/08/ec31d4b70b38a2467556de787f6e80491cfbf9d2.jpg"},"content":"我能说没有看懂这个图片吗？哪位大神给解释一下那个白色的物体是什么"}}],"hasLiked":false,"likers":[{"_id":"55db210d40c87c5914ff35cc","id":"55db210d40c87c5914ff35cc","created":"2015-08-24T13:50:05.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/04/24/11/973e11aeab2e022bfccb4050b32ed4bb0634b7e9.jpg"},{"_id":"55bc85e2054c4eb2abcceafc","id":"55bc85e2054c4eb2abcceafc","created":"2015-08-01T08:40:02.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/01/12/22/0916ed2ae54152c1ff19897c673d95b2eb6ac290.jpg"},{"_id":"550851fce08669da601e7c4e","id":"550851fce08669da601e7c4e","created":"2015-03-17T16:10:36.000Z","avatar":"http://static1.gotokeep.com/avatar/2015/10/22/11/5c85b9599c610f3898ca762ffb15c6f94cfd1354.jpg"},{"_id":"55ccc9b84a375988e94bae4f","id":"55ccc9b84a375988e94bae4f","created":"2015-08-13T16:45:44.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/7578EF9F8C5A0806F0DE9516E57F96D0/100"},{"_id":"5572b5aec7e9bcd5b47a168a","id":"5572b5aec7e9bcd5b47a168a","created":"2015-06-06T08:56:14.000Z","avatar":"http://static1.gotokeep.com/avatar/2015/12/26/20/05d3daa606ca8415a9f02c23a05a1214fbe8476e.jpg"},{"_id":"56073d1d1969f3a8ab6fdcfa","id":"56073d1d1969f3a8ab6fdcfa","created":"2015-09-27T00:49:33.000Z","avatar":""},{"_id":"55812edb87f60ccb6569e1f6","id":"55812edb87f60ccb6569e1f6","created":"2015-06-17T08:24:59.000Z","avatar":"http://static1.gotokeep.com/avatar/2015/07/23/22/e10592731e27981e23d781df27b70bc233982b63.jpg"},{"_id":"559ba41bb43fb99f94b46368","id":"559ba41bb43fb99f94b46368","created":"2015-07-07T10:04:11.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/03/06/13/6fe1ac6929931192fa147d61f52aba1651b921c2.jpg"},{"_id":"573a73b671c58f5b04c6a0ba","id":"573a73b671c58f5b04c6a0ba","created":"2016-05-17T01:28:22.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/05/17/19/196ceaed55b8dec6c9fab702c7a557f21d317a29.jpg"},{"_id":"5593b2e2ab6fe8b599fd6ce9","id":"5593b2e2ab6fe8b599fd6ce9","created":"2015-07-01T09:29:06.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/02/01/20/74d8230a8057058e443bccd4ba3436c7ef6a768c.jpg"}],"hasFavorited":false}
     * errorCode : 0
     * now : 2016-05-20T01:18:51.313Z
     * version : 1.0.0
     */

    private boolean ok;
    /**
     * _id : 573dda12bc0ccfc9055a9d02
     * content : 接下来是一场与地球引力的恶战，你准备好了吗 #我要上精选# #我的日常健身#
     * photo : http://static1.gotokeep
     * .com/picture/2016/05/19/23/720142b0c1b420a4cd0b756e917c5813ef76b977.jpg
     * author : {"_id":"54fe6e5c944fd9ce2dafc97a","id":"54fe6e5c944fd9ce2dafc97a",
     * "created":"2015-03-10T04:09:00.000Z","username":"Eric董","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/03/10/ed0d24ffd53ca350fd046a3fda215b2bb8d06201.jpg","gender":"M"}
     * __v : 0
     * modified : 2016-05-19T15:21:54.644Z
     * stateValue : 30
     * state : hot
     * achievements : []
     * viewCount : 1
     * favoriteCount : 19
     * contentType : ["text","photo"]
     * type : direct
     * geo : []
     * noise : false
     * public : true
     * likes : 294
     * comments : 30
     * meta : {"name":" 新版功能 ","count":1}
     * created : 2016-05-19T15:21:54.000Z
     * id : 573dda12bc0ccfc9055a9d02
     * commentsList : [{"__v":"0","content":"帅","author":{"_id":"56073d1d1969f3a8ab6fdcfa",
     * "id":"56073d1d1969f3a8ab6fdcfa","created":"2015-09-27T00:49:33.000Z","username":"信仰ii蜕变",
     * "avatar":""},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20
     * 2016 09:08:05 GMT+0800 (CST)","_id":"573e637546054cc85d4663e5","stateValue":20,
     * "state":"normal","created":"2016-05-20T01:08:05.000Z","id":"573e637546054cc85d4663e5"},
     * {"__v":"0","content":"美！","author":{"_id":"56ab0b592da443fc473619b5",
     * "id":"56ab0b592da443fc473619b5","created":"2016-01-29T06:48:57.000Z","username":"Cesar凯撒",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/02/10/18/2506ba659f002de2141a42c8ff87c6f3b1dc36f1.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 09:06:27
     * GMT+0800 (CST)","_id":"573e631335a5fdc46143c5d9","stateValue":20,"state":"normal",
     * "created":"2016-05-20T01:06:27.000Z","id":"573e631335a5fdc46143c5d9"},{"__v":"0",
     * "content":"董老大身高体重多少啊？","author":{"_id":"561b72239fe26b8059938e9d",
     * "id":"561b72239fe26b8059938e9d","created":"2015-10-12T08:41:07.000Z","username":"南昌九戒",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2015/10/22/11/d77fa2b929ea3d61dd863372fe54133b793417bd.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:59:14
     * GMT+0800 (CST)","_id":"573e61624e540bac611913d7","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:59:14.000Z","id":"573e61624e540bac611913d7"},{"__v":"0",
     * "content":"要不你加我QQ吧 在这里也说不清楚2678518160","reply":"573e5af0047c5bb83c734f20",
     * "author":{"_id":"573dd23501238b22057104c4","id":"573dd23501238b22057104c4",
     * "created":"2016-05-19T14:48:21.000Z","username":"Yam23","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:49:11
     * GMT+0800 (CST)","_id":"573e5f07aa65bcac3cca1b5f","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:49:11.000Z","id":"573e5f07aa65bcac3cca1b5f",
     * "replyComment":{"author":{"_id":"56a9a0e972dccec047416f79",
     * "id":"56a9a0e972dccec047416f79","created":"2016-01-28T05:02:33.000Z",
     * "username":"sorrow_wb","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/19/20/d5b3b2bdee08581d656a4a11739051c505e1a99d.jpg"},
     * "content":"怎么改造啊"}},{"__v":"0","modified":"Fri May 20 2016 08:37:02 GMT+0800 (CST)",
     * "stateValue":20,"id":"573e5c2e085a96843c4f71b1","refe":"573dda12bc0ccfc9055a9d02",
     * "author":{"_id":"570fdfe3b54df6610dfe12c2","id":"570fdfe3b54df6610dfe12c2",
     * "created":"2016-04-14T18:22:27.000Z","username":"MANYSI-R","avatar":"http://static1
     * .gotokeep.com/avatar/2016/04/06/15/d6be17f2759f1da5555a484fa24c1eff96770d3d.jpg"},
     * "content":"哥们： 蛋白粉一般什么时候吃？？ 看说明每日一次，每次10g   到有些朋友每天吃很多。那么到底每天吃多少？什么时候吃？？非常感谢。",
     * "state":"normal","refe_type":"entry","_id":"573e5c2e085a96843c4f71b1",
     * "created":"2016-05-20T00:37:02.000Z"},{"__v":"0","content":"怎么改造啊",
     * "reply":"573e5850b02254943c8f3904","author":{"_id":"56a9a0e972dccec047416f79",
     * "id":"56a9a0e972dccec047416f79","created":"2016-01-28T05:02:33.000Z",
     * "username":"sorrow_wb","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/19/20/d5b3b2bdee08581d656a4a11739051c505e1a99d.jpg"},
     * "refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:31:44
     * GMT+0800 (CST)","_id":"573e5af0047c5bb83c734f20","stateValue":20,"state":"normal",
     * "created":"2016-05-20T00:31:44.000Z","id":"573e5af0047c5bb83c734f20",
     * "replyComment":{"author":{"_id":"573dd23501238b22057104c4",
     * "id":"573dd23501238b22057104c4","created":"2016-05-19T14:48:21.000Z","username":"Yam23",
     * "avatar":"http://q.qlogo.cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},
     * "content":"夏天到了，我的鸡皮肤终于改善好了，我的短裤，我的短裙😍"}},{"__v":"0","content":"蛋白粉哪种好呢？？？？",
     * "author":{"_id":"57359153f2936f9b3665fde0","id":"57359153f2936f9b3665fde0",
     * "created":"2016-05-13T08:33:23.000Z","username":"小猪猪88888","avatar":"http://wx.qlogo
     * .cn/mmopen/qWQDYs6XzWtVibRj5EMTo6Zp1UqISB6GTJaiaAH694bVTgt1XwUgW9WX84fQSMB4TB886EGjbMrH4kiaGlDTsrU11Xx9QTcUMaw/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:26:15 GMT+0800 (CST)","_id":"573e59a7a5f6cabd05b44b3a","stateValue":20,"state":"normal","created":"2016-05-20T00:26:15.000Z","id":"573e59a7a5f6cabd05b44b3a"},{"__v":"0","modified":"Fri May 20 2016 08:20:32 GMT+0800 (CST)","stateValue":20,"id":"573e5850b02254943c8f3904","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"573dd23501238b22057104c4","id":"573dd23501238b22057104c4","created":"2016-05-19T14:48:21.000Z","username":"Yam23","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB06FA2A737A31CFC6BD3BBA5B32D9FD/100"},"content":"夏天到了，我的鸡皮肤终于改善好了，我的短裤，我的短裙😍","state":"normal","refe_type":"entry","_id":"573e5850b02254943c8f3904","created":"2016-05-20T00:20:32.000Z"},{"__v":"0","content":"👍👍","author":{"_id":"55aa6d786f6a4afedcd1e62c","id":"55aa6d786f6a4afedcd1e62c","created":"2015-07-18T15:15:04.000Z","username":"爱屋及乌1224","avatar":"http://static1.gotokeep.com/avatar/2016/01/13/17/4a8f40d6c966002c1a7d7b7afce1fc81dbd5d0c9.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","modified":"Fri May 20 2016 08:17:39 GMT+0800 (CST)","_id":"573e57a322fcaba0610a7100","stateValue":20,"state":"normal","created":"2016-05-20T00:17:39.000Z","id":"573e57a322fcaba0610a7100"},{"__v":"0","refe":"573dda12bc0ccfc9055a9d02","created":"2016-05-20T00:12:17.000Z","id":"573e5661085a96843c4f6387","content":"在保证营养全面均衡的前提下，控制摄入热量，加上适当的运动","author":{"_id":"56c5a90dbb119a2705fdd8d0","id":"56c5a90dbb119a2705fdd8d0","created":"2016-02-18T11:20:45.000Z","username":"kbl_lihao","avatar":"http://static1.gotokeep.com/avatar/2016/03/24/21/d8e300063b36b8b7a7da22e49d5fe6e44638c149.jpg"},"state":"normal","_id":"573e5661085a96843c4f6387","stateValue":20,"refe_type":"entry","modified":"Fri May 20 2016 08:12:17 GMT+0800 (CST)","reply":"573e4ee1aa2a06b1205f9631","replyComment":{"author":{"_id":"5672083d602f07e787c7d06d","id":"5672083d602f07e787c7d06d","created":"2015-12-17T00:56:29.000Z","username":"前往一百八","avatar":"http://static1.gotokeep.com/avatar/2016/01/14/22/9c10ad03d1aad971413ff81371a0ec85dc616e75.jpg"},"content":"请问一下，到瓶颈期，体重一直在180左右，怎么办？"}},{"_id":"573e506d047c5bb83c733122","content":"要上天？","author":{"_id":"555f1d6192e80e7464383729","id":"555f1d6192e80e7464383729","created":"2015-05-22T12:13:21.000Z","username":"veelor","avatar":"http://static1.gotokeep.com/avatar/2016/02/31/22/117c3b220638f6d32f8bed545a3ac71345e64f45.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:46:53 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:46:53.000Z","id":"573e506d047c5bb83c733122"},{"_id":"573e4fc24915d6ac5ddefd63","content":"乜勇哦现在雨下一整晚惊恐万状因为我进步","author":{"_id":"563f83d0866531bc80c6a175","id":"563f83d0866531bc80c6a175","created":"2015-11-08T17:18:08.000Z","username":"达达兔兔","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEIwLY76YibxKhEWichibCibfLCCl2wvSr3He4ib2IGnqHlyr8lUNVvg4iaBlTW4hNQnzliaOUSKf4qPan4gGNEldTEKkZVgZAnficJy3p8/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:44:02 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:44:02.000Z","id":"573e4fc24915d6ac5ddefd63"},{"stateValue":20,"content":"请问一下，到瓶颈期，体重一直在180左右，怎么办？","created":"2016-05-19T23:40:17.000Z","__v":"0","_id":"573e4ee1aa2a06b1205f9631","state":"normal","refe_type":"entry","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"5672083d602f07e787c7d06d","id":"5672083d602f07e787c7d06d","created":"2015-12-17T00:56:29.000Z","username":"前往一百八","avatar":"http://static1.gotokeep.com/avatar/2016/01/14/22/9c10ad03d1aad971413ff81371a0ec85dc616e75.jpg"},"id":"573e4ee1aa2a06b1205f9631","modified":"Fri May 20 2016 07:40:17 GMT+0800 (CST)"},{"stateValue":20,"content":"好西木哦，！我才刚刚起步不知何时才有效果啊😊","created":"2016-05-19T23:04:57.000Z","__v":"0","_id":"573e4699b0197590613feb47","state":"normal","refe_type":"entry","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"5735055b2d1221550942f82e","id":"5735055b2d1221550942f82e","created":"2016-05-12T22:36:11.000Z","username":"持枪荡群雌","avatar":""},"id":"573e4699b0197590613feb47","modified":"Fri May 20 2016 07:04:57 GMT+0800 (CST)"},{"_id":"573e45a749eb01d5055ed855","content":"手动赞，加油。求互粉！btw，已加微信。关注下","author":{"_id":"56f325d1164ceebb4168ea23","id":"56f325d1164ceebb4168ea23","created":"2016-03-23T23:25:05.000Z","username":"健康的赵钱孙","avatar":"http://static1.gotokeep.com/avatar/2016/05/13/22/8b9f08c7b8abf83efd2d069c918ffad313ff73a9.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 07:00:55 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T23:00:55.000Z","id":"573e45a749eb01d5055ed855"},{"_id":"573e3abab0197590613fc731","content":"肌肉很棒","author":{"_id":"56d3a51013d2dd400ffeffa5","id":"56d3a51013d2dd400ffeffa5","created":"2016-02-29T01:55:28.000Z","username":"Johnnylee2016","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaELaonPSPdD0IEQReRKia35xFrHcMcGyDSh41Xt0h0m3r4UazJNrIH1O5MzewDia30ajKJJCdBpBeT1A/0"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 06:14:18 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T22:14:18.000Z","id":"573e3abab0197590613fc731"},{"_id":"573e2da6b0197590613fb943","content":"我叫不忘初心，你叫傻子长大，各人叫法不同啊","reply":"573e2901088193603cec631a","author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 05:18:30 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T21:18:30.000Z","id":"573e2da6b0197590613fb943","replyComment":{"author":{"_id":"55969ed32e034f0c21d77173","id":"55969ed32e034f0c21d77173","created":"2015-07-03T14:40:19.000Z","username":"怪蝎子","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"},"content":"你是说，傻子长大了呗！"}},{"_id":"573e2901088193603cec631a","content":"你是说，傻子长大了呗！","reply":"573df162491e55783cde3c0c","author":{"_id":"55969ed32e034f0c21d77173","id":"55969ed32e034f0c21d77173","created":"2015-07-03T14:40:19.000Z","username":"怪蝎子","avatar":"http://q.qlogo.cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"},"refe":"573dda12bc0ccfc9055a9d02","refe_type":"entry","__v":"0","modified":"Fri May 20 2016 04:58:41 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-19T20:58:41.000Z","id":"573e2901088193603cec631a","replyComment":{"author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"content":"万磁王，我准备好了！经过十二年的不断艰苦训练和苦苦坚持，我终于从一个懵懂无知天真可爱的少年，成长成了一个懵懂无知天真可爱的青年！😳🔥🔥🔥"}},{"__v":"0","modified":"Fri May 20 2016 01:01:22 GMT+0800 (CST)","stateValue":20,"id":"573df162491e55783cde3c0c","refe":"573dda12bc0ccfc9055a9d02","author":{"_id":"55d491e0fb1f6da0e0ff4f09","id":"55d491e0fb1f6da0e0ff4f09","created":"2015-08-19T14:25:36.000Z","username":"煮茶阅简","avatar":"http://static1.gotokeep.com/avatar/2016/05/04/23/3172e88a808eea81005e119608eb3ee0f7893164.jpg"},"content":"万磁王，我准备好了！经过十二年的不断艰苦训练和苦苦坚持，我终于从一个懵懂无知天真可爱的少年，成长成了一个懵懂无知天真可爱的青年！😳🔥🔥🔥","state":"normal","refe_type":"entry","_id":"573df162491e55783cde3c0c","created":"2016-05-19T17:01:22.000Z"},{"state":"normal","reply":"573ddc0401e2ff2d05d6b38f","author":{"_id":"564f42d01befd6eb76fbd2e4","id":"564f42d01befd6eb76fbd2e4","created":"2015-11-20T15:57:04.000Z","username":"蜡笔小新爱啊啊","avatar":"http://static1.gotokeep.com/avatar/2015/10/21/23/8bafae801744a3bbc4e43a4ff54ff6869404a6aa.jpg"},"refe":"573dda12bc0ccfc9055a9d02","__v":"0","content":"镁粉，防汗防滑。一般体操运动还有大运动健身都用","id":"573de8fd664fa03f0583eae3","stateValue":20,"created":"2016-05-19T16:25:33.000Z","refe_type":"entry","modified":"Fri May 20 2016 00:25:33 GMT+0800 (CST)","_id":"573de8fd664fa03f0583eae3","replyComment":{"author":{"_id":"55c1a84bd1d082638f718c4e","id":"55c1a84bd1d082638f718c4e","created":"2015-08-05T06:08:11.000Z","username":"傲娇傲娇小个子","avatar":"http://static1.gotokeep.com/avatar/2016/01/18/08/ec31d4b70b38a2467556de787f6e80491cfbf9d2.jpg"},"content":"我能说没有看懂这个图片吗？哪位大神给解释一下那个白色的物体是什么"}}]
     * hasLiked : false
     * likers : [{"_id":"55db210d40c87c5914ff35cc","id":"55db210d40c87c5914ff35cc",
     * "created":"2015-08-24T13:50:05.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2016/04/24/11/973e11aeab2e022bfccb4050b32ed4bb0634b7e9.jpg"},
     * {"_id":"55bc85e2054c4eb2abcceafc","id":"55bc85e2054c4eb2abcceafc",
     * "created":"2015-08-01T08:40:02.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2016/01/12/22/0916ed2ae54152c1ff19897c673d95b2eb6ac290.jpg"},
     * {"_id":"550851fce08669da601e7c4e","id":"550851fce08669da601e7c4e",
     * "created":"2015-03-17T16:10:36.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2015/10/22/11/5c85b9599c610f3898ca762ffb15c6f94cfd1354.jpg"},
     * {"_id":"55ccc9b84a375988e94bae4f","id":"55ccc9b84a375988e94bae4f",
     * "created":"2015-08-13T16:45:44.000Z","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/7578EF9F8C5A0806F0DE9516E57F96D0/100"},
     * {"_id":"5572b5aec7e9bcd5b47a168a","id":"5572b5aec7e9bcd5b47a168a",
     * "created":"2015-06-06T08:56:14.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2015/12/26/20/05d3daa606ca8415a9f02c23a05a1214fbe8476e.jpg"},
     * {"_id":"56073d1d1969f3a8ab6fdcfa","id":"56073d1d1969f3a8ab6fdcfa",
     * "created":"2015-09-27T00:49:33.000Z","avatar":""},{"_id":"55812edb87f60ccb6569e1f6",
     * "id":"55812edb87f60ccb6569e1f6","created":"2015-06-17T08:24:59.000Z",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2015/07/23/22/e10592731e27981e23d781df27b70bc233982b63.jpg"},
     * {"_id":"559ba41bb43fb99f94b46368","id":"559ba41bb43fb99f94b46368",
     * "created":"2015-07-07T10:04:11.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2016/03/06/13/6fe1ac6929931192fa147d61f52aba1651b921c2.jpg"},
     * {"_id":"573a73b671c58f5b04c6a0ba","id":"573a73b671c58f5b04c6a0ba",
     * "created":"2016-05-17T01:28:22.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/17/19/196ceaed55b8dec6c9fab702c7a557f21d317a29.jpg"},
     * {"_id":"5593b2e2ab6fe8b599fd6ce9","id":"5593b2e2ab6fe8b599fd6ce9",
     * "created":"2015-07-01T09:29:06.000Z","avatar":"http://static1.gotokeep
     * .com/avatar/2016/02/01/20/74d8230a8057058e443bccd4ba3436c7ef6a768c.jpg"}]
     * hasFavorited : false
     */

    private DataBean data;
    private int errorCode;
    private String now;
    private String version;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static class DataBean {
        private String _id;
        private String content;
        private String photo;
        /**
         * _id : 54fe6e5c944fd9ce2dafc97a
         * id : 54fe6e5c944fd9ce2dafc97a
         * created : 2015-03-10T04:09:00.000Z
         * username : Eric董
         * avatar : http://static1.gotokeep
         * .com/avatar/2016/05/03/10/ed0d24ffd53ca350fd046a3fda215b2bb8d06201.jpg
         * gender : M
         */

        private AuthorBean author;
        private int __v;
        private String modified;
        private int stateValue;
        private String state;
        private int viewCount;
        private int favoriteCount;
        private String type;
        private boolean noise;
        @SerializedName("public")
        private boolean publicX;
        private int likes;
        private int comments;
        /**
         * name :  新版功能
         * count : 1
         */

        private MetaBean meta;
        private String created;
        private String id;
        private boolean hasLiked;
        private boolean hasFavorited;
        private List<?> achievements;
        private List<String> contentType;
        private List<?> geo;
        /**
         * __v : 0
         * content : 帅
         * author : {"_id":"56073d1d1969f3a8ab6fdcfa","id":"56073d1d1969f3a8ab6fdcfa",
         * "created":"2015-09-27T00:49:33.000Z","username":"信仰ii蜕变","avatar":""}
         * refe : 573dda12bc0ccfc9055a9d02
         * refe_type : entry
         * modified : Fri May 20 2016 09:08:05 GMT+0800 (CST)
         * _id : 573e637546054cc85d4663e5
         * stateValue : 20
         * state : normal
         * created : 2016-05-20T01:08:05.000Z
         * id : 573e637546054cc85d4663e5
         */

        private List<CommentsListBean> commentsList;
        /**
         * _id : 55db210d40c87c5914ff35cc
         * id : 55db210d40c87c5914ff35cc
         * created : 2015-08-24T13:50:05.000Z
         * avatar : http://static1.gotokeep
         * .com/avatar/2016/04/24/11/973e11aeab2e022bfccb4050b32ed4bb0634b7e9.jpg
         */

        private List<LikersBean> likers;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public AuthorBean getAuthor() {
            return author;
        }

        public void setAuthor(AuthorBean author) {
            this.author = author;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public String getModified() {
            return modified;
        }

        public void setModified(String modified) {
            this.modified = modified;
        }

        public int getStateValue() {
            return stateValue;
        }

        public void setStateValue(int stateValue) {
            this.stateValue = stateValue;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getViewCount() {
            return viewCount;
        }

        public void setViewCount(int viewCount) {
            this.viewCount = viewCount;
        }

        public int getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(int favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isNoise() {
            return noise;
        }

        public void setNoise(boolean noise) {
            this.noise = noise;
        }

        public boolean isPublicX() {
            return publicX;
        }

        public void setPublicX(boolean publicX) {
            this.publicX = publicX;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isHasLiked() {
            return hasLiked;
        }

        public void setHasLiked(boolean hasLiked) {
            this.hasLiked = hasLiked;
        }

        public boolean isHasFavorited() {
            return hasFavorited;
        }

        public void setHasFavorited(boolean hasFavorited) {
            this.hasFavorited = hasFavorited;
        }

        public List<?> getAchievements() {
            return achievements;
        }

        public void setAchievements(List<?> achievements) {
            this.achievements = achievements;
        }

        public List<String> getContentType() {
            return contentType;
        }

        public void setContentType(List<String> contentType) {
            this.contentType = contentType;
        }

        public List<?> getGeo() {
            return geo;
        }

        public void setGeo(List<?> geo) {
            this.geo = geo;
        }

        public List<CommentsListBean> getCommentsList() {
            return commentsList;
        }

        public void setCommentsList(List<CommentsListBean> commentsList) {
            this.commentsList = commentsList;
        }

        public List<LikersBean> getLikers() {
            return likers;
        }

        public void setLikers(List<LikersBean> likers) {
            this.likers = likers;
        }

        public static class AuthorBean {
            private String _id;
            private String id;
            private String created;
            private String username;
            private String avatar;
            private String gender;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }
        }

        public static class MetaBean {
            private String name;
            private int count;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }

        public static class CommentsListBean {

            private String __v;
            private String content;
            /**
             * _id : 56073d1d1969f3a8ab6fdcfa
             * id : 56073d1d1969f3a8ab6fdcfa
             * created : 2015-09-27T00:49:33.000Z
             * username : 信仰ii蜕变
             * avatar :
             */

            private AuthorBean author;
            private String refe;
            private String refe_type;
            private String modified;
            private String _id;
            private int stateValue;
            private String state;
            private String created;
            private String id;
            /**
             * reply : 573e2901088193603cec631a
             * replyComment : {"author":{"_id":"55969ed32e034f0c21d77173",
             * "id":"55969ed32e034f0c21d77173","created":"2015-07-03T14:40:19.000Z",
             * "username":"怪蝎子","avatar":"http://q.qlogo
             * .cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"},"content":"你是说，傻子长大了呗！"}
             */

            private String reply;
            /**
             * author : {"_id":"55969ed32e034f0c21d77173","id":"55969ed32e034f0c21d77173",
             * "created":"2015-07-03T14:40:19.000Z","username":"怪蝎子","avatar":"http://q.qlogo
             * .cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100"}
             * content : 你是说，傻子长大了呗！
             */

            private ReplyCommentBean replyComment;

            public String get__v() {
                return __v;
            }

            public void set__v(String __v) {
                this.__v = __v;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getRefe() {
                return refe;
            }

            public void setRefe(String refe) {
                this.refe = refe;
            }

            public String getRefe_type() {
                return refe_type;
            }

            public void setRefe_type(String refe_type) {
                this.refe_type = refe_type;
            }

            public String getModified() {
                return modified;
            }

            public void setModified(String modified) {
                this.modified = modified;
            }

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public int getStateValue() {
                return stateValue;
            }

            public void setStateValue(int stateValue) {
                this.stateValue = stateValue;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getReply() {
                return reply;
            }

            public void setReply(String reply) {
                this.reply = reply;
            }

            public ReplyCommentBean getReplyComment() {
                return replyComment;
            }

            public void setReplyComment(ReplyCommentBean replyComment) {
                this.replyComment = replyComment;
            }

            public static class AuthorBean {
                private String _id;
                private String id;
                private String created;
                private String username;
                private String avatar;

                public String get_id() {
                    return _id;
                }

                public void set_id(String _id) {
                    this._id = _id;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getCreated() {
                    return created;
                }

                public void setCreated(String created) {
                    this.created = created;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }
            }

            public static class ReplyCommentBean {
                /**
                 * _id : 55969ed32e034f0c21d77173
                 * id : 55969ed32e034f0c21d77173
                 * created : 2015-07-03T14:40:19.000Z
                 * username : 怪蝎子
                 * avatar : http://q.qlogo.cn/qqapp/1103727446/BB5B930C63DCA3A78F836C2CB217652F/100
                 */

                private AuthorBean author;
                private String content;

                public AuthorBean getAuthor() {
                    return author;
                }

                public void setAuthor(AuthorBean author) {
                    this.author = author;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public static class AuthorBean {
                    private String _id;
                    private String id;
                    private String created;
                    private String username;
                    private String avatar;

                    public String get_id() {
                        return _id;
                    }

                    public void set_id(String _id) {
                        this._id = _id;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getCreated() {
                        return created;
                    }

                    public void setCreated(String created) {
                        this.created = created;
                    }

                    public String getUsername() {
                        return username;
                    }

                    public void setUsername(String username) {
                        this.username = username;
                    }

                    public String getAvatar() {
                        return avatar;
                    }

                    public void setAvatar(String avatar) {
                        this.avatar = avatar;
                    }
                }
            }
        }

        public static class LikersBean {
            private String _id;
            private String id;
            private String created;
            private String avatar;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreated() {
                return created;
            }

            public void setCreated(String created) {
                this.created = created;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }
        }
    }
}
