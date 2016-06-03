package com.news.keep.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Administrator
 * @time 2016/5/21 0021 下午 10:51
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class WebBean {

    /**
     * ok : true
     * data : {"_id":"573eea02cc0656c905df4110","html":"<p><span
     * style=\"font-family:宋体\">减脂期，不少人都对香蕉有很多疑惑\u2014\u2014<\/span><\/p><p>&nbsp;<\/p><ul
     * class=\" list-paddingleft-2\" style=\"list-style-type: disc;\"><li><p><span
     * style=\"font-family:宋体\">为什么说香蕉会让人长胖？是淀粉么？<\/span><\/p><\/li><li><p><span
     * style=\"font-family:宋体\">香蕉里具体有什么成份？<\/span><\/p><\/li><li><p><span
     * style=\"font-family:宋体\">香蕉会影响减脂么？<\/span><\/p><\/li><li><p><span
     * style=\"font-family:宋体\">减脂的时候，香蕉到底能不能吃？怎么吃？<\/span><\/p><p><span
     * style=\"font-family:宋体\"><\/span><\/p><\/li><\/ul><p><span
     * style=\"font-family:宋体\"><br/><\/span><\/p><p><span
     * style=\"font-family:宋体\">是时候跟大家好好探讨探讨<strong>「香蕉」<\/strong>这个物种啦！<\/span><\/p><p>&nbsp;
     * <img src=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png\"
     * title=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png\"
     * alt=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png\"/><\/p><p><span
     * style=\"font-family: 宋体; font-weight: bold;\"><br/><\/span><\/p><p><span
     * style=\"font-family: 宋体; font-weight: bold;\">一、为什么说香蕉会让人长胖？是淀粉么？<\/span><\/p><p>&nbsp;
     * <\/p><p><span style=\"font-family:宋体\">首先，香蕉本身是「零脂肪」食物，所以<strong
     * >从脂肪这个角度来说，香蕉是不会让你长胖的<\/strong>（当然，前提是摄入＜消耗）。<\/span><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">那我们来看看淀粉：<\/span><\/p><p><span
     * style=\"font-family:宋体\"><br/><\/span><\/p><p><span style=\"font-family:宋体\">一根中等尺寸（&nbsp;
     * <\/span>118&nbsp;<span style=\"font-family:宋体\">克）左右的香蕉含有<\/span>27<span
     * style=\"font-family:宋体\">克碳水化合物，其中&nbsp;<\/span>6&nbsp;<span
     * style=\"font-family:宋体\">克是淀粉。<\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">淀粉就是糖<\/span><\/strong><span
     * style=\"font-family:宋体\">，是「很多葡萄糖组合在一起的复合糖」，<strong>如果单独大量食用，确实容易导致「餐后血糖偏高，不利于减脂」<\/strong
     * >。（还记得糖的分类么？我们借下面这张图来温习下：<\/span><\/p><p><img src=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png\" title=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png\" alt=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png\" style=\"font-family: 宋体;
     * \"/><br/><\/p><p><span style=\"font-family: 宋体;\"><span style=\"font-family: 宋体;
     * \">其次，东方人在已经摄入很多主食的前提下，又把香蕉当做零食的饮食方法，确实容易导致过量摄入淀粉<\/span>/<span style=\"font-family: 宋体;
     * \">糖。<\/span><\/span><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">请记住，<\/span><strong><span
     * style=\"font-family:宋体\">一根中等尺寸香蕉所含的糖相当于&nbsp;<\/span>2&nbsp;<span
     * style=\"font-family:宋体\">两<\/span>/100&nbsp;<span
     * style=\"font-family:宋体\">克米饭<\/span><\/strong><span
     * style=\"font-family:宋体\">，而亚洲人很少一次只吃&nbsp;<\/span>2&nbsp;<span
     * style=\"font-family:宋体\">两米饭。一碗米饭至少&nbsp;<\/span>3-4&nbsp;<span
     * style=\"font-family:宋体\">两，两碗米饭就相当于&nbsp;<\/span>6-8&nbsp;<span
     * style=\"font-family:宋体\">两，相当于吃了&nbsp;<\/span>3-4&nbsp;<span
     * style=\"font-family:宋体\">根香蕉！<\/span><\/p><p><span
     * style=\"font-family:宋体\"><br/><\/span><\/p><p><span
     * style=\"font-family:宋体\">所以，<strong>如果你吃了米饭，然后又吃香蕉，那你的糖摄入量极有可能超标<\/strong
     * >，而多余的糖只有三种归宿：<\/span><\/p><p>&nbsp;<\/p><blockquote><p>1<span
     * style=\"font-family:宋体\">）<\/span> <span
     * style=\"font-family:宋体\">被肝脏储存起来；<\/span><\/p><p>2<span
     * style=\"font-family:宋体\">）<\/span>&nbsp;<span
     * style=\"font-family:宋体\">被肌肉储存起来；<\/span><\/p><p>3<span
     * style=\"font-family:宋体\">）<\/span>&nbsp;<span
     * style=\"font-family:宋体\">变成脂肪。<\/span><\/p><\/blockquote><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">这就是所谓的「香蕉令人发胖」或者「淀粉令人发胖」的主要原因之一。<\/span><\/p><p>&nbsp;
     * <\/p><p><span
     * style=\"font-family:宋体\">换而言之，当你的「供应＞需求」时，多余的供应就有可能变成糟粕。这最终是一个能量守恒的问题，并不难理解。<\/span><\/p
     * ><p>&nbsp;<\/p><p><strong>二、<span style=\"font-family: 宋体;
     * \">香蕉里具体有什么成份？<\/span><\/strong><\/p><p><img src=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png\" title=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png\" alt=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png\"/><\/p><p><span
     * style=\"font-family:宋体\">一根中等尺寸的香蕉（<\/span>118&nbsp;<span
     * style=\"font-family:宋体\">克左右）含有：<\/span><\/p><p>&nbsp;<\/p><blockquote><p><span
     * style=\"font-family:宋体\">热量：约为&nbsp;<\/span>100&nbsp;<span
     * style=\"font-family:宋体\">千卡（<\/span>Kcal）<\/p><p><span
     * style=\"font-family:宋体\">碳水化合物：&nbsp;<\/span>27 <span
     * style=\"font-family:宋体\">克<\/span><\/p><p><span style=\"font-family:宋体\">膳食纤维：&nbsp;
     * <\/span>3&nbsp;<span style=\"font-family: 宋体\">克<\/span><\/p><p><span
     * style=\"font-family:宋体\">蛋白质：&nbsp;<\/span>1&nbsp;<span style=\"font-family:
     * 宋体\">克<\/span><\/p><p><span style=\"font-family:宋体\">脂肪：&nbsp;<\/span>0&nbsp;<span
     * style=\"font-family: 宋体\">克<\/span><\/p><p>&nbsp;<\/p><\/blockquote><p><span
     * style=\"font-family:宋体\">香蕉的具体营养成分：<\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">成份一<\/span>　<span style=\"font-family:宋体\">碳水化合物<\/span>/<span
     * style=\"font-family: 宋体\">糖<\/span><\/strong>&nbsp;<\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">香蕉&nbsp;<\/span>90%&nbsp;<span style=\"font-family:
     * 宋体\">的热量来自于碳水化合物，且越是未成熟的香蕉（青香蕉），其中的淀粉和抗性淀粉含量就越多（抗性淀粉是一种类似于膳食纤维的好淀粉，没有热量）。<\/span><\/p><p
     * >&nbsp;<\/p><p><strong><span style=\"font-family:宋体\">成份二<\/span>　<span
     * style=\"font-family:宋体\">膳食纤维<\/span><\/strong><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">除此之外，香蕉含有非常多的膳食纤维，蛋白质和脂肪含量几乎为零。膳食纤维可以降血糖、促排便，对于减脂益处多多。<\/span
     * ><\/p><p>&nbsp;<\/p><p><span style=\"font-family:宋体\">不过，想要获益于膳食纤维的功效，<\/span>Keep<span
     * style=\"font-family:宋体\">君 建议大家还是要吃「不过分熟透，颜色呈亮黄」的香蕉，而不是青香蕉或发黑的香蕉。<\/span><\/p><p><br/><\/p
     * ><p><span
     * style=\"font-family:宋体\">青香蕉中有不少鞣酸，对肠道有收敛作用，传统医学是用来「治疗腹泻」的，反而没有促排便作用。一定要记住哟！<\/span><\/p
     * ><p><img src=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png\"
     * title=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png\"
     * alt=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png\"/>&nbsp;
     * <\/p><p><strong><span style=\"font-family:宋体\"><br/><\/span><\/strong><\/p><p><strong
     * ><span style=\"font-family:宋体\">成份三<\/span>&nbsp;<span
     * style=\"font-family:宋体\">维生素和矿物质<\/span><\/strong><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">每根中等尺寸（<\/span>118&nbsp;<span
     * style=\"font-family:宋体\">克）香蕉含有：<\/span><\/p><p>&nbsp;<\/p><blockquote><p><span
     * style=\"font-size: 14px; color: rgb(127, 127, 127);\">*RDI <span style=\"font-size: 14px;
     * font-family: 宋体;\">为建议每日摄取量<\/span><\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">钾：<\/span>9% RDI <\/strong><span
     * style=\"font-family:宋体\">（大白话：吃了&nbsp;<\/span>118&nbsp;<span
     * style=\"font-family:宋体\">克香蕉，你就满足了每天应摄入钾总量的&nbsp;<\/span>9%<span
     * style=\"font-family:宋体\">。或者再简单一点，就是你吃&nbsp;<\/span>11&nbsp;<span
     * style=\"font-family:宋体\">根这么大的香蕉，你的钾就补足了！当然，<\/span>Keep <span
     * style=\"font-family:宋体\">君不是让你吃这么多香蕉来补钾！）<\/span><\/p><p><br/><\/p><p><span
     * style=\"font-family:宋体\">钾钠平衡对于保持身材很重要，因为钾会让多余的钠排出体外，减少水肿，从而让你的外表和体重都看起来更好！<\/span><\/p><p
     * >&nbsp;<\/p><p><strong><span style=\"font-family:宋体\">维他命<\/span>B6<span
     * style=\"font-family: 宋体\">：<\/span>33% RDI <\/strong><span
     * style=\"font-family:宋体\">（对于消除水肿同样重要）<\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">维他命<\/span>C<span style=\"font-family: 宋体\">：<\/span>11% RDI
     * <\/strong><span style=\"font-family:宋体\">（美白、抗氧化、提升免疫力）<\/span><\/p><p>&nbsp;
     * <\/p><p><strong><span style=\"font-family:宋体\">镁：<\/span>8% RDI <\/strong><span
     * style=\"font-family:宋体\">（放松肌肉和神经，可以缓解失眠）<\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">铜：<\/span>10% RDI <\/strong><span
     * style=\"font-family:宋体\">（保证造血功能正常）<\/span><\/p><p>&nbsp;<\/p><p><strong><span
     * style=\"font-family:宋体\">锰：<\/span>14% RDI <\/strong><span
     * style=\"font-family:宋体\">（促进维他命<\/span>B&nbsp;<span style=\"font-family:宋体\">和&nbsp;
     * <\/span>C&nbsp;<span style=\"font-family: 宋体\">的吸收利用）<\/span><\/p><\/blockquote><p>&nbsp;
     * <\/p><p><strong>三、<span style=\"font-family: 宋体;
     * \">香蕉会影响减脂么？<\/span><\/strong><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">首先，我们必须要谨记于心，<\/span><strong><span
     * style=\"font-family:宋体\">脂肪<\/span>=<span
     * style=\"font-family:宋体\">摄入＞消耗<\/span><\/strong><span
     * style=\"font-family:宋体\">。任何超出我们需求的摄入都会让你长肉。<\/span><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">那话说回来，如果我保证摄入＜消耗，那香蕉会影响减脂么？<\/span><\/p><p>&nbsp;
     * <\/p><p>Keep<span style=\"font-family:宋体\">君
     * 的回答是：不会，<strong>反而对减脂有帮助。<\/strong><\/span><\/p><p>&nbsp;&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">香蕉里的一些成份确实对减脂有辅助作用，请大家往下看：<\/span><\/p><p><img
     * src=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000.png\"
     * title=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000.png\"
     * alt=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000
     * .png\"/><\/p><p><strong><span style=\"font-family:宋体\">成份一：<\/span>&nbsp;<span
     * style=\"font-family:宋体\">膳食纤维<\/span><\/strong><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">香蕉里的的膳食纤维大致分为：<\/span><\/p><p>&nbsp;<\/p><p>&nbsp; &nbsp;1.&nbsp;
     * <span style=\"font-family:宋体\">抗性淀粉<\/span><\/p><p><br/><\/p><p><span
     * style=\"font-family:宋体\">一种不能被人体消化的淀粉，青香蕉里最多，作用类似于膳食纤维。不过青香蕉鞣酸较多，容易引起便秘，所以<strong
     * >建议大家还是吃\u201c熟到刚好\u201d（既不要太青，也不要起黑点）的香蕉。<\/strong><\/span><\/p><p>&nbsp;<\/p><p>&nbsp;
     * &nbsp;2.&nbsp;<span style=\"font-family:宋体\">果胶<\/span><\/p><p><br/><\/p><p><span
     * style=\"font-family:宋体\">一种水溶性纤维。同样，熟到刚好的香蕉里果胶含量较多，熟透则变少。<\/span><\/p><p>&nbsp;
     * <\/p><p><span style=\"font-family:宋体\">这两种纤维对于减脂的好处包括：<\/span><\/p><p>&nbsp;
     * <\/p><blockquote><p><span style=\"font-family:宋体\">增加饱腹感；<\/span><\/p><p>&nbsp;
     * <\/p><p><span style=\"font-family:宋体\">促进排便（记住哦，减肥的重中之重就是改善便秘！没有排出体外的脂肪是会被再次吸收利用的！）<\/span
     * ><\/p><p>&nbsp;<\/p><p><span style=\"font-family:宋体\">降低餐后血糖（餐后血糖越低，糖分越不容易转化成脂肪！）<\/span
     * ><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">促进肠道益生菌的生长（益生菌越多，越能够阻止身体对脂肪的吸收和利用！）<\/span><\/p><\/blockquote><p
     * >&nbsp;<\/p><p><strong><span style=\"font-family: 宋体;\">成份二<\/span>：<span
     * style=\"font-family: 宋体;\">钾<\/span><\/strong><\/p><p><br/><\/p><p><span
     * style=\"font-family:宋体\">你以为钾听起来和减肥没啥关系？错了！钾钠平衡知道不？<\/span><\/p><p>&nbsp;
     * <\/p><blockquote><p><strong><span style=\"font-family:宋体\">多吃盐<\/span>=<span
     * style=\"font-family: 宋体\">多吃钠<\/span>=<span style=\"font-family:宋体\">身体水肿<\/span>=<span
     * style=\"font-family: 宋体\">外形差<\/span>=<span
     * style=\"font-family:宋体\">体重升<\/span><\/strong><\/p><p><strong>&nbsp;
     * <\/strong><\/p><p><strong><span style=\"font-family:宋体\">多吃钾<\/span>=<span
     * style=\"font-family: 宋体\">排出钠<\/span>=<span style=\"font-family:宋体\">退水肿<\/span>=<span
     * style=\"font-family: 宋体\">苗条身材<\/span>=<span
     * style=\"font-family:宋体\">体重降<\/span><\/strong><\/p><p>&nbsp;<\/p><\/blockquote><p><span
     * style=\"font-family:宋体\">这个逻辑是不是很清晰？<\/span><\/p><p>&nbsp;<\/p><p><strong>四、<span
     * style=\"font-family: 宋体;\">减脂的时候，香蕉到底能不能吃？怎么吃？<\/span><\/strong><\/p><p>&nbsp;
     * <\/p><p><strong><span style=\"font-family:宋体\">香蕉减脂期间能不能吃？能吃！增肌能吃，减脂也能吃！<\/span><\/strong
     * ><span style=\"font-family:宋体\">但是，为了让大家充分受益于香蕉的健康功效，<\/span>Keep<span
     * style=\"font-family:宋体\">君 还是谨慎地为大家制定了一些吃香蕉的「原则和底线」：<\/span><\/p><p>&nbsp;<\/p><p>&nbsp;
     * &nbsp;1.&nbsp;<span style=\"font-family: 宋体;\">可以把香蕉作为主食<\/span><\/p><p><br/><\/p><p><span
     * style=\"font-family:宋体\">一次吃一根中等尺寸的香蕉刚好。可以在<\/span><strong><span
     * style=\"font-family:宋体\">正餐前&nbsp;<\/span>20-30&nbsp;<span
     * style=\"font-family:宋体\">分钟吃<\/span><\/strong><span
     * style=\"font-family:宋体\">，然后正餐吃一些干净、少油的蔬菜和肉类。<\/span><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">换而言之，你吃了香蕉，同一餐就不要再摄入其它类型的主食（土豆、红薯、米饭、面条、包子等）以及水果。<\/span><\/p><p
     * >&nbsp;<\/p><p>&nbsp; &nbsp;2.&nbsp;<span
     * style=\"font-family:宋体\">运动前后可以吃香蕉<\/span><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">运动前后身体需要快速能量，这时候的摄入可以最大化利用香蕉中的糖分（运动前后&nbsp;<\/span>30-45&nbsp;
     * <span style=\"font-family:宋体\">分钟可以吃，具体情况视个人消化情况而定）。<\/span><\/p><p>&nbsp;<\/p><p>&nbsp;
     * &nbsp;3.&nbsp;<span style=\"font-family:宋体\">不要和酸奶<\/span>/<span
     * style=\"font-family:宋体\">牛奶一起吃<\/span><\/p><p><img src=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png\" title=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png\" alt=\"http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png\"/><\/p><p><span
     * style=\"font-family:宋体\">酸奶和牛奶含有很多乳糖（也属于快糖）。还有些豆奶、巧克力奶又额外添加了糖分；加上香蕉中的淀粉、葡萄糖、果糖，<strong
     * >容易导致同时摄入过多的快糖，非常不健康<\/strong>。喜欢奶昔的朋友尤其要注意这点！<\/span><\/p><p>&nbsp;<\/p><p>&nbsp; &nbsp;4
     * .&nbsp;<span style=\"font-family:宋体\">不要吃大果盘<\/span>&nbsp;<\/p><p><img
     * src=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a706fc00000.png\"
     * title=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a706fc00000.png\"
     * alt=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a706fc00000
     * .png\"/><\/p><p>&nbsp;<span style=\"font-family: 宋体;
     * \">尽管水果属于低脂，高纤维食材，但<strong>过多的果糖只会让你越来越胖，阻碍减脂<\/strong>。好东西不代表多多益善，适量很重要。<\/span><\/p><p
     * >&nbsp;<\/p><p>&nbsp; &nbsp;5.&nbsp;<span
     * style=\"font-family:宋体\">不要和坚果一起吃<\/span><\/p><p><br/><\/p><p><strong><span
     * style=\"font-family:宋体\">糖和脂肪的摄入永远要成反比<\/span><\/strong><span
     * style=\"font-family:宋体\">！坚果的主要成份就是脂肪，而香蕉的主要成份是糖。这两者尽量不要一起吃！<\/span><\/p><p>&nbsp;
     * <\/p><p>&nbsp; &nbsp;6.&nbsp;<span style=\"font-family:宋体\">吃「熟到刚好」的香蕉<\/span><\/p><p><img
     * src=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000.png\"
     * title=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000.png\"
     * alt=\"http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000
     * .png\"/><\/p><p>&nbsp;<\/p><p><span
     * style=\"font-family:宋体\">太青（生）的香蕉，可能会导致消化不良以及便秘；太熟（发黑）的香蕉含糖和纤维量又会下降。所以要吃「熟到刚好」，或者说「<strong
     * >呈亮黄色，表皮光滑坚实<\/strong>」的香蕉，此时它对于健康的益处最大。<\/span><\/p><p><span
     * style=\"font-family:宋体\"><br/><\/span><\/p><p><span
     * style=\"font-family:宋体\">关于香蕉你还有什么要问的吗？在下面的留言区和大家一起聊聊吧~<\/span><\/p><p><br/><\/p><p
     * style=\"white-space: normal;\"><span style=\"font-size: 14px; color: rgb(127, 127, 127);
     * \">@&nbsp;<a
     * href=\"http://show.gotokeep.com/users/549cd5697e7ed6ee5c94ba4b\" target=\"_self\"
     * textvalue=\"Keep_技术分享\">Keep_技术分享<\/a>&nbsp;，带你了解更多专业健身知识&nbsp;；<\/span><\/p><p
     * style=\"white-space: normal;\"><span style=\"font-size: 14px; color: rgb(127, 127, 127);
     * \">@&nbsp;<a
     * href=\"http://show.gotokeep.com/users/56178e241779a99315da9373\" target=\"_self\"
     * textvalue=\"Keep_精选\">Keep_精选<\/a>&nbsp; ，和你分享&nbsp;Keepers
     * 自己的故事、经验和心得，还有精挑细选的装备供你种草；<\/span><\/p><p style=\"white-space: normal;\"><span
     * style=\"font-size: 14px; color: rgb(127, 127, 127);\">@&nbsp;
     * <a href=\"http://show.gotokeep.com/users/55ac969edceb3b0fdf13bcfd\" target=\"_self\">Keep_吃惑<\/a>&nbsp;&nbsp;学习营养饮食知识、学做健身餐；<\/span><\/p><p style=\"white-space: normal;\"><span style=\"font-size: 14px; color: rgb(127, 127, 127);\">@&nbsp;<a href=\"http://show.gotokeep.com/users/56d3fe83ca2f02ff1310b1e6\" target=\"_self\">Keep_活动<\/a>&nbsp;&nbsp;，在这里找到新活动和获奖名单；<\/span><\/p><p style=\"white-space: normal;\"><span style=\"font-size: 14px; color: rgb(127, 127, 127);\">@&nbsp;<a href=\"http://show.gotokeep.com/users/54bf30dd9eb5cd2c4c90be46\" target=\"_self\">Keep<\/a>&nbsp;&nbsp;，Keep&nbsp;发生的大事都在这儿~<\/span><\/p><p style=\"white-space: normal;\"><span style=\"color: rgb(127, 127, 127);\"><span style=\"font-size: 14px;\">想要玩转Keep，就关注起来吧~<\/span><\/span><\/p><p><br/><\/p>","photo":"http://static1.gotokeep.com/misc/2016/05/20/18/55336c014c000000.jpg","title":"因为淀粉惧怕香蕉？难怪你会减脂失败！","content":"为什么说香蕉会让人长胖？是淀粉么？香蕉里具体有什么成份？如果你也有这些疑惑，一定不能错过这篇文章！","author":{"_id":"55ac969edceb3b0fdf13bcfd","id":"55ac969edceb3b0fdf13bcfd","created":"2015-07-20T06:35:10.000Z","username":"Keep_吃惑","avatar":"http://static1.gotokeep.com/avatar/2016/02/17/15/19870d900ac396b892567b96f3398f99c0042d13.jpg","gender":"M"},"__v":0,"modified":"2016-05-20T10:42:33.515Z","stateValue":20,"state":"normal","achievements":[],"viewCount":1,"favoriteCount":1838,"contentType":[],"type":"article","geo":[],"noise":false,"public":true,"likes":11,"comments":102,"meta":{"name":" 专题 ","count":1},"created":"2016-05-20T10:42:10.000Z","id":"573eea02cc0656c905df4110","commentsList":[{"__v":"0","content":"我感觉越吃越饿( \u2022̥́ ˍ \u2022̀ू )","author":{"_id":"55aa025a58b9aa08de4561b1","id":"55aa025a58b9aa08de4561b1","created":"2015-07-18T07:38:02.000Z","username":"muggle心烧","avatar":"http://static1.gotokeep.com/avatar/2016/03/20/21/9331523bf90b566644696ba8bcfe8d21f4b752a1.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:40:59 GMT+0800 (CST)","_id":"5740494b701a69c75154d543","stateValue":20,"state":"normal","created":"2016-05-21T11:40:59.000Z","id":"5740494b701a69c75154d543"},{"__v":"0","content":"以后得改方式了😌","reply":"573fc8707f862161204df54e","author":{"_id":"569afb21a0ffef6457b89387","id":"569afb21a0ffef6457b89387","created":"2016-01-17T02:23:29.000Z","username":"Yukinly","avatar":"http://static1.gotokeep.com/avatar/2016/03/18/09/4f7e70c43f5c083a263fb59d5b8293bab1a26945.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:37:06 GMT+0800 (CST)","_id":"574048629b5c6b3a057ec22d","stateValue":20,"state":"normal","created":"2016-05-21T11:37:06.000Z","id":"574048629b5c6b3a057ec22d","replyComment":{"author":{"_id":"567e3dee9554e02963507303","id":"567e3dee9554e02963507303","created":"2015-12-26T07:12:46.000Z","username":"丨开心丨","avatar":"http://static1.gotokeep.com/avatar/2016/04/15/15/ed75fab3e78975d45419d5b3f173ce39b1f89cd3.jpg"},"content":"一样的，我经常是水果和酸奶，还天真的以为比较减肥，，。"}},{"__v":"0","content":"吃香蕉的姿势有要求吗？","author":{"_id":"56538fbe3ccbebd49aeb8186","id":"56538fbe3ccbebd49aeb8186","created":"2015-11-23T22:14:22.000Z","username":"胡安冬","avatar":"http://static1.gotokeep.com/avatar/2015/12/02/08/a81faec6d38a9f5a472a651240b7c68471e768ae.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:25:07 GMT+0800 (CST)","_id":"574045931f66434605f77682","stateValue":20,"state":"normal","created":"2016-05-21T11:25:07.000Z","id":"574045931f66434605f77682"},{"__v":"0","content":"嗯嗯，我的个人看法而已","reply":"57403c63cd90812c0533966c","author":{"_id":"55b81ec6b876283b67240eb1","id":"55b81ec6b876283b67240eb1","created":"2015-07-29T00:31:02.000Z","username":"毛小毛啦啦啦","avatar":"http://static1.gotokeep.com/avatar/2016/00/29/08/e3819ae7c5acd87e2d7c774d4dafd85443995f42.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:52:27 GMT+0800 (CST)","_id":"57403debb020809e18de92fe","stateValue":20,"state":"normal","created":"2016-05-21T10:52:27.000Z","id":"57403debb020809e18de92fe","replyComment":{"author":{"_id":"567168bbb5ebf10c02e5ab3e","id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢","avatar":"http://static1.gotokeep.com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},"content":"\u2026\u2026你觉得\u2026\u2026"}},{"__v":"0","content":"晚餐吃一个香蕉和一个苹果行吗","author":{"_id":"573fd95423ba3fe3514f6327","id":"573fd95423ba3fe3514f6327","created":"2016-05-21T03:43:16.000Z","username":"sunset_1","avatar":"http://q.qlogo.cn/qqapp/1103727446/CC6408C786C993628586843CB16ECB9B/100"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:51:15 GMT+0800 (CST)","_id":"57403da34b7316240533027c","stateValue":20,"state":"normal","created":"2016-05-21T10:51:15.000Z","id":"57403da34b7316240533027c"},{"__v":"0","content":"一天吃多少香蕉比较好呢？","author":{"_id":"56a2b2d71764e8e54785f403","id":"56a2b2d71764e8e54785f403","created":"2016-01-22T22:53:11.000Z","username":"运动1357","avatar":"http://static1.gotokeep.com/avatar/2016/03/23/22/bfecd7b7e0852cfcb8e5d6903c891630879b1d12.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:48:18 GMT+0800 (CST)","_id":"57403cf270c9404805cee973","stateValue":20,"state":"normal","created":"2016-05-21T10:48:18.000Z","id":"57403cf270c9404805cee973"},{"__v":"0","content":"干货满满，果断收藏。","author":{"_id":"567168bbb5ebf10c02e5ab3e","id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢","avatar":"http://static1.gotokeep.com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:47:00 GMT+0800 (CST)","_id":"57403ca44c006ece1876fb5a","stateValue":20,"state":"normal","created":"2016-05-21T10:47:00.000Z","id":"57403ca44c006ece1876fb5a"},{"__v":"0","content":"\u2026\u2026你觉得\u2026\u2026","reply":"573f91539d94a5d751a9608a","author":{"_id":"567168bbb5ebf10c02e5ab3e","id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢","avatar":"http://static1.gotokeep.com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:45:55 GMT+0800 (CST)","_id":"57403c63cd90812c0533966c","stateValue":20,"state":"normal","created":"2016-05-21T10:45:55.000Z","id":"57403c63cd90812c0533966c","replyComment":{"author":{"_id":"55b81ec6b876283b67240eb1","id":"55b81ec6b876283b67240eb1","created":"2015-07-29T00:31:02.000Z","username":"毛小毛啦啦啦","avatar":"http://static1.gotokeep.com/avatar/2016/00/29/08/e3819ae7c5acd87e2d7c774d4dafd85443995f42.jpg"},"content":"我都是酸奶拌香蕉吃的！补充蛋白质和能量！我觉得应该可以的吧"}},{"_id":"5740388fca2d53fb51502277","content":"可以当早餐吃么？","author":{"_id":"5735e1995b51cbcb36cac746","id":"5735e1995b51cbcb36cac746","created":"2016-05-13T14:15:53.000Z","username":"Ms-夏","avatar":"http://static1.gotokeep.com/avatar/2016/05/13/22/e3ec54c4e671de9f4b73858c54601ef8e1e3f156.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 18:29:35 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T10:29:35.000Z","id":"5740388fca2d53fb51502277"},{"content":"吃惑君之前说过饮食比例4:4:2，是质量比还是热量比，具体怎么计算？基础代谢率和每天所需热量怎么计算，请吃惑君解答。","modified":"Sat May 21 2016 17:45:29 GMT+0800 (CST)","refe":"573eea02cc0656c905df4110","id":"57402e39d5d2951e5dda4653","stateValue":20,"created":"2016-05-21T09:45:29.000Z","refe_type":"entry","__v":"0","author":{"_id":"56eddc7d63b07e0175b5c34c","id":"56eddc7d63b07e0175b5c34c","created":"2016-03-19T23:10:53.000Z","username":"桃之夭夭8866","avatar":""},"state":"normal","_id":"57402e39d5d2951e5dda4653"},{"content":"每天我都是吃饭完了 两个小时后吃一根请问可以吗","author":{"_id":"56e17d86f598531405a77430","id":"56e17d86f598531405a77430","created":"2016-03-10T13:58:30.000Z","username":"Ccc上心","avatar":"http://static1.gotokeep.com/avatar/2016/03/10/21/148842933136f746e227301a8551e6ba4687e16c.jpg"},"__v":"0","refe":"573eea02cc0656c905df4110","modified":"Sat May 21 2016 17:41:59 GMT+0800 (CST)","refe_type":"entry","_id":"57402d670fac794261887fb6","stateValue":20,"created":"2016-05-21T09:41:59.000Z","id":"57402d670fac794261887fb6","state":"normal"},{"_id":"5740249c1826cd2a61baa3c7","content":"@宋嘉楠7了个七小萝卜","author":{"_id":"56adef0b0491676438307a2c","id":"56adef0b0491676438307a2c","created":"2016-01-31T11:24:59.000Z","username":"Jwlovescarrot","avatar":"http://static1.gotokeep.com/avatar/2016/01/31/19/698281ebd90c099d5fb46293c22561c28d05ef23.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 17:04:28 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T09:04:28.000Z","id":"5740249c1826cd2a61baa3c7"},{"_id":"574016e4cae475075215fbe3","content":"早上爱吃微微有些涩的香蕉 熟透的不爱吃","author":{"_id":"55da78dde4a0c9a765f3b310","id":"55da78dde4a0c9a765f3b310","created":"2015-08-24T01:52:29.000Z","username":"家里猫","avatar":"http://static1.gotokeep.com/avatar/2015/09/19/15/cf5c1464dc4c811ff80face2ab7262ff278d4551.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 16:05:56 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T08:05:56.000Z","id":"574016e4cae475075215fbe3"},{"modified":"Sat May 21 2016 15:53:36 GMT+0800 (CST)","__v":"0","_id":"57401400617ac3135d9890cb","refe_type":"entry","refe":"573eea02cc0656c905df4110","stateValue":20,"content":"这样很好啊！小编说不能混酸奶，是因为买来的酸奶都已经加了很多的糖，你的自制酸奶没有糖，所以不会引起糖分超标的。","created":"2016-05-21T07:53:36.000Z","state":"normal","author":{"_id":"563b0b3b09056c5eed6eaa6d","id":"563b0b3b09056c5eed6eaa6d","created":"2015-11-05T07:54:35.000Z","username":"王园子","avatar":"http://static1.gotokeep.com/avatar/2015/11/05/15/03241a0e18994e9db72d20a56296f5864e21fd9b.jpg"},"reply":"573f0a09526b425161dc5859","id":"57401400617ac3135d9890cb","replyComment":{"author":{"_id":"5665aee7647b333705be73cf","id":"5665aee7647b333705be73cf","created":"2015-12-07T16:08:07.000Z","username":"牛头尊","avatar":"http://static1.gotokeep.com/avatar/2016/00/05/16/150e8576c45605b787bb56f1317d38a93850c2d3.jpg"},"content":"。。我老是把香蕉扮到酸奶里面代替糖。。。。酸奶是自己用酸奶机做的那种。。"}},{"_id":"574011f70b8f0af518ed0e89","content":"我似乎很喜欢饭后吃一根香蕉。。。天。","author":{"_id":"562b2bec2daf999381da0262","id":"562b2bec2daf999381da0262","created":"2015-10-24T06:57:48.000Z","username":"莹小胖","avatar":"http://static1.gotokeep.com/avatar/2016/04/21/15/9da2c0e5d2a23870ed855098bd61f4275e44ce7f.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 15:44:55 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T07:44:55.000Z","id":"574011f70b8f0af518ed0e89"},{"_id":"574006879d94a5d751aad04c","content":"我想知道薯类  如红薯  紫薯  能不能减肥","author":{"_id":"572895d7e31a8d270503bf15","id":"572895d7e31a8d270503bf15","created":"2016-05-03T12:13:11.000Z","username":"50kgfighting","avatar":"http://q.qlogo.cn/qqapp/1103727446/C4DCCAFE4FBC8C2A7D9A49D68264654E/100"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 14:56:07 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T06:56:07.000Z","id":"574006879d94a5d751aad04c"},{"content":"如果酸奶/牛奶都不太适合和香蕉一起吃，那香蕉牛油果和牛奶混打岂不是超标了N多？一起吃只是不利于减脂其他的危害应该没有吧？","modified":"Sat May 21 2016 14:51:14 GMT+0800 (CST)","refe":"573eea02cc0656c905df4110","id":"57400562d343387e6188bd80","stateValue":20,"created":"2016-05-21T06:51:14.000Z","refe_type":"entry","__v":"0","author":{"_id":"561f6aaa6916ec1a47b8b800","id":"561f6aaa6916ec1a47b8b800","created":"2015-10-15T08:58:18.000Z","username":"Mr_LeeJ","avatar":"http://static1.gotokeep.com/avatar/2015/10/21/22/e2832dd47bf9c19a052f62461ab71b510023063f.jpg"},"state":"normal","_id":"57400562d343387e6188bd80"},{"_id":"573fffd3617ac3135d983d59","content":"吃什么有助于减肥","author":{"_id":"573fed90a52a465b5ddf10af","id":"573fed90a52a465b5ddf10af","created":"2016-05-21T05:09:36.000Z","username":"13411913547","avatar":"http://q.qlogo.cn/qqapp/1103727446/159C525FE0C10E2CCBBFCCBF9C9BB5AA/100"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 14:27:31 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T06:27:31.000Z","id":"573fffd3617ac3135d983d59"},{"_id":"573ff62ca52a465b5ddf2bda","author":{"_id":"557fff360a07217bbb93bc7b","id":"557fff360a07217bbb93bc7b","created":"2015-06-16T10:49:26.000Z","username":"大脸猫-M","avatar":"http://static1.gotokeep.com/avatar/2016/01/07/14/23421165df8a3b56dc924da83cc6b0cace2a11e8.jpg"},"refe":"573eea02cc0656c905df4110","__v":"0","content":"keep君，下期说说红薯能不能帮助减脂吧，拜托拜托😘","state":"normal","id":"573ff62ca52a465b5ddf2bda","stateValue":20,"refe_type":"entry","modified":"Sat May 21 2016 13:46:20 GMT+0800 (CST)","created":"2016-05-21T05:46:20.000Z"},{"_id":"573feb3f4f56ffe6187bad68","content":"又get到新知识了","author":{"_id":"570cf888fe607a0f7a201c52","id":"570cf888fe607a0f7a201c52","created":"2016-04-12T13:30:48.000Z","username":"CQ小子","avatar":"http://static1.gotokeep.com/avatar/2016/03/12/21/8b7d4ff1b567b8262703a5d6c73a5a5fd0b23602.jpg"},"refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21 2016 12:59:43 GMT+0800 (CST)","stateValue":20,"state":"normal","created":"2016-05-21T04:59:43.000Z","id":"573feb3f4f56ffe6187bad68"}],"hasLiked":false,"likers":[{"_id":"57401dbb526b425161dfb494","id":"57401dbb526b425161dfb494","created":"2016-05-21T08:35:07.000Z","avatar":"http://wx.qlogo.cn/mmopen/azHWq9JzsibBOic02WHxPDCNAlT3C8FDia0v6HprpnbDorNSIicTb8Qpc7SoFWwjA6ickT0GkoiaiaxP5Eqk4k4MfeuvlF0XsLLv46C/0"},{"_id":"5655d03f77172073d697e3ef","id":"5655d03f77172073d697e3ef","created":"2015-11-25T15:14:07.000Z","avatar":""},{"_id":"573953c926911ac00c3da228","id":"573953c926911ac00c3da228","created":"2016-05-16T04:59:53.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/D0B8735C164928F14468628BBDADD548/100"},{"_id":"573fe64071d560da18def2c7","id":"573fe64071d560da18def2c7","created":"2016-05-21T04:38:24.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/188143304D7A14AE99C6A59C84232504/100"},{"_id":"573fe007d3d7aaef5138f089","id":"573fe007d3d7aaef5138f089","created":"2016-05-21T04:11:51.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/04/21/12/e95f3d66d9fa2ea36af6d75a02cf497e5cba7c04.jpg"},{"_id":"573faf0f4e39594c5d124e81","id":"573faf0f4e39594c5d124e81","created":"2016-05-21T00:42:55.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/3056B21138CA0B351DF0C3ED1F0604BE/100"},{"_id":"573dbab305150b2305bea2f5","id":"573dbab305150b2305bea2f5","created":"2016-05-19T13:08:03.000Z","avatar":""},{"_id":"56af276591f87cca33c9dce3","id":"56af276591f87cca33c9dce3","created":"2016-02-01T09:37:41.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/50EFF77157579170ED69E9319D08385B/100"},{"_id":"573f2dc4c0788c12615d1934","id":"573f2dc4c0788c12615d1934","created":"2016-05-20T15:31:16.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/279E40DDA81911FD8CCE4A2430D37E27/100"},{"_id":"573f0c6f180e4e315d651e9f","id":"573f0c6f180e4e315d651e9f","created":"2016-05-20T13:09:03.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/04/20/21/c0822d432f9614bd64d513d5c644298cd0d4dc38.jpg"}],"hasFavorited":false}
     * errorCode : 0
     * now : 2016-05-21T11:43:28.920Z
     * version : 1.0.0
     */

    private boolean ok;
    /**
     * _id : 573eea02cc0656c905df4110
     * html : <p><span style="font-family:宋体">减脂期，不少人都对香蕉有很多疑惑——</span></p><p>&nbsp;</p><ul
     * class=" list-paddingleft-2" style="list-style-type: disc;"><li><p><span
     * style="font-family:宋体">为什么说香蕉会让人长胖？是淀粉么？</span></p></li><li><p><span
     * style="font-family:宋体">香蕉里具体有什么成份？</span></p></li><li><p><span
     * style="font-family:宋体">香蕉会影响减脂么？</span></p></li><li><p><span
     * style="font-family:宋体">减脂的时候，香蕉到底能不能吃？怎么吃？</span></p><p><span
     * style="font-family:宋体"></span></p></li></ul><p><span
     * style="font-family:宋体"><br/></span></p><p><span
     * style="font-family:宋体">是时候跟大家好好探讨探讨<strong>「香蕉」</strong>这个物种啦！</span></p><p>&nbsp;<img
     * src="http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png"
     * title="http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png"
     * alt="http://static1.gotokeep.com/misc/2016/05/20/18/55336b421c400000.png"/></p><p><span
     * style="font-family: 宋体; font-weight: bold;"><br/></span></p><p><span style="font-family:
     * 宋体; font-weight: bold;">一、为什么说香蕉会让人长胖？是淀粉么？</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">首先，香蕉本身是「零脂肪」食物，所以<strong>从脂肪这个角度来说，香蕉是不会让你长胖的</strong
     * >（当然，前提是摄入＜消耗）。</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">那我们来看看淀粉：</span></p><p><span
     * style="font-family:宋体"><br/></span></p><p><span style="font-family:宋体">一根中等尺寸（&nbsp;
     * </span>118&nbsp;<span style="font-family:宋体">克）左右的香蕉含有</span>27<span
     * style="font-family:宋体">克碳水化合物，其中&nbsp;</span>6&nbsp;<span
     * style="font-family:宋体">克是淀粉。</span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">淀粉就是糖</span></strong><span
     * style="font-family:宋体">，是「很多葡萄糖组合在一起的复合糖」，<strong>如果单独大量食用，确实容易导致「餐后血糖偏高，不利于减脂」</strong
     * >。（还记得糖的分类么？我们借下面这张图来温习下：</span></p><p><img src="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png" title="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png" alt="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336d5b5b000000.png" style="font-family: 宋体;"/><br/></p><p><span
     * style="font-family: 宋体;"><span style="font-family: 宋体;
     * ">其次，东方人在已经摄入很多主食的前提下，又把香蕉当做零食的饮食方法，确实容易导致过量摄入淀粉</span>/<span style="font-family: 宋体;
     * ">糖。</span></span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">请记住，</span><strong><span
     * style="font-family:宋体">一根中等尺寸香蕉所含的糖相当于&nbsp;</span>2&nbsp;<span
     * style="font-family:宋体">两</span>/100&nbsp;<span
     * style="font-family:宋体">克米饭</span></strong><span style="font-family:宋体">，而亚洲人很少一次只吃&nbsp;
     * </span>2&nbsp;<span style="font-family:宋体">两米饭。一碗米饭至少&nbsp;</span>3-4&nbsp;<span
     * style="font-family:宋体">两，两碗米饭就相当于&nbsp;</span>6-8&nbsp;<span
     * style="font-family:宋体">两，相当于吃了&nbsp;</span>3-4&nbsp;<span
     * style="font-family:宋体">根香蕉！</span></p><p><span
     * style="font-family:宋体"><br/></span></p><p><span
     * style="font-family:宋体">所以，<strong>如果你吃了米饭，然后又吃香蕉，那你的糖摄入量极有可能超标</strong>，而多余的糖只有三种归宿：</span
     * ></p><p>&nbsp;</p><blockquote><p>1<span style="font-family:宋体">）</span> <span
     * style="font-family:宋体">被肝脏储存起来；</span></p><p>2<span style="font-family:宋体">）</span>&nbsp;
     * <span style="font-family:宋体">被肌肉储存起来；</span></p><p>3<span
     * style="font-family:宋体">）</span>&nbsp;<span
     * style="font-family:宋体">变成脂肪。</span></p></blockquote><p>&nbsp;</p><p><span
     * style="font-family:宋体">这就是所谓的「香蕉令人发胖」或者「淀粉令人发胖」的主要原因之一。</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">换而言之，当你的「供应＞需求」时，多余的供应就有可能变成糟粕。这最终是一个能量守恒的问题，并不难理解。</span></p><p
     * >&nbsp;</p><p><strong>二、<span style="font-family: 宋体;
     * ">香蕉里具体有什么成份？</span></strong></p><p><img src="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png" title="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png" alt="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b77ca000000.png"/></p><p><span
     * style="font-family:宋体">一根中等尺寸的香蕉（</span>118&nbsp;<span
     * style="font-family:宋体">克左右）含有：</span></p><p>&nbsp;</p><blockquote><p><span
     * style="font-family:宋体">热量：约为&nbsp;</span>100&nbsp;<span
     * style="font-family:宋体">千卡（</span>Kcal）</p><p><span style="font-family:宋体">碳水化合物：&nbsp;
     * </span>27 <span style="font-family:宋体">克</span></p><p><span
     * style="font-family:宋体">膳食纤维：&nbsp;</span>3&nbsp;<span style="font-family:
     * 宋体">克</span></p><p><span style="font-family:宋体">蛋白质：&nbsp;</span>1&nbsp;<span
     * style="font-family: 宋体">克</span></p><p><span style="font-family:宋体">脂肪：&nbsp;
     * </span>0&nbsp;<span style="font-family: 宋体">克</span></p><p>&nbsp;</p></blockquote><p><span
     * style="font-family:宋体">香蕉的具体营养成分：</span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">成份一</span>　<span style="font-family:宋体">碳水化合物</span>/<span
     * style="font-family: 宋体">糖</span></strong>&nbsp;</p><p>&nbsp;</p><p><span
     * style="font-family:宋体">香蕉&nbsp;</span>90%&nbsp;<span style="font-family:
     * 宋体">的热量来自于碳水化合物，且越是未成熟的香蕉（青香蕉），其中的淀粉和抗性淀粉含量就越多（抗性淀粉是一种类似于膳食纤维的好淀粉，没有热量）。</span></p><p
     * >&nbsp;</p><p><strong><span style="font-family:宋体">成份二</span>　<span
     * style="font-family:宋体">膳食纤维</span></strong></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">除此之外，香蕉含有非常多的膳食纤维，蛋白质和脂肪含量几乎为零。膳食纤维可以降血糖、促排便，对于减脂益处多多。</span></p><p
     * >&nbsp;</p><p><span style="font-family:宋体">不过，想要获益于膳食纤维的功效，</span>Keep<span
     * style="font-family:宋体">君 建议大家还是要吃「不过分熟透，颜色呈亮黄」的香蕉，而不是青香蕉或发黑的香蕉。</span></p><p><br/></p><p
     * ><span style="font-family:宋体">青香蕉中有不少鞣酸，对肠道有收敛作用，传统医学是用来「治疗腹泻」的，反而没有促排便作用。一定要记住哟！</span
     * ></p><p><img src="http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png"
     * title="http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png"
     * alt="http://static1.gotokeep.com/misc/2016/05/20/18/55336b9f3a800000.png"/>&nbsp;
     * </p><p><strong><span style="font-family:宋体"><br/></span></strong></p><p><strong><span
     * style="font-family:宋体">成份三</span>&nbsp;<span
     * style="font-family:宋体">维生素和矿物质</span></strong></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">每根中等尺寸（</span>118&nbsp;<span
     * style="font-family:宋体">克）香蕉含有：</span></p><p>&nbsp;</p><blockquote><p><span
     * style="font-size: 14px; color: rgb(127, 127, 127);">*RDI <span style="font-size: 14px;
     * font-family: 宋体;">为建议每日摄取量</span></span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">钾：</span>9% RDI </strong><span style="font-family:宋体">（大白话：吃了&nbsp;
     * </span>118&nbsp;<span style="font-family:宋体">克香蕉，你就满足了每天应摄入钾总量的&nbsp;</span>9%<span
     * style="font-family:宋体">。或者再简单一点，就是你吃&nbsp;</span>11&nbsp;<span
     * style="font-family:宋体">根这么大的香蕉，你的钾就补足了！当然，</span>Keep <span
     * style="font-family:宋体">君不是让你吃这么多香蕉来补钾！）</span></p><p><br/></p><p><span
     * style="font-family:宋体">钾钠平衡对于保持身材很重要，因为钾会让多余的钠排出体外，减少水肿，从而让你的外表和体重都看起来更好！</span></p><p
     * >&nbsp;</p><p><strong><span style="font-family:宋体">维他命</span>B6<span style="font-family:
     * 宋体">：</span>33% RDI </strong><span style="font-family:宋体">（对于消除水肿同样重要）</span></p><p>&nbsp;
     * </p><p><strong><span style="font-family:宋体">维他命</span>C<span style="font-family:
     * 宋体">：</span>11% RDI </strong><span
     * style="font-family:宋体">（美白、抗氧化、提升免疫力）</span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">镁：</span>8% RDI </strong><span
     * style="font-family:宋体">（放松肌肉和神经，可以缓解失眠）</span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">铜：</span>10% RDI </strong><span
     * style="font-family:宋体">（保证造血功能正常）</span></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">锰：</span>14% RDI </strong><span
     * style="font-family:宋体">（促进维他命</span>B&nbsp;<span style="font-family:宋体">和&nbsp;
     * </span>C&nbsp;<span style="font-family: 宋体">的吸收利用）</span></p></blockquote><p>&nbsp;
     * </p><p><strong>三、<span style="font-family: 宋体;">香蕉会影响减脂么？</span></strong></p><p>&nbsp;
     * </p><p><span style="font-family:宋体">首先，我们必须要谨记于心，</span><strong><span
     * style="font-family:宋体">脂肪</span>=<span style="font-family:宋体">摄入＞消耗</span></strong><span
     * style="font-family:宋体">。任何超出我们需求的摄入都会让你长肉。</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">那话说回来，如果我保证摄入＜消耗，那香蕉会影响减脂么？</span></p><p>&nbsp;</p><p>Keep<span
     * style="font-family:宋体">君 的回答是：不会，<strong>反而对减脂有帮助。</strong></span></p><p>&nbsp;&nbsp;
     * </p><p><span style="font-family:宋体">香蕉里的一些成份确实对减脂有辅助作用，请大家往下看：</span></p><p><img
     * src="http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000.png"
     * title="http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000.png"
     * alt="http://static1.gotokeep.com/misc/2016/05/20/18/55336bbb41400000
     * .png"/></p><p><strong><span style="font-family:宋体">成份一：</span>&nbsp;<span
     * style="font-family:宋体">膳食纤维</span></strong></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">香蕉里的的膳食纤维大致分为：</span></p><p>&nbsp;</p><p>&nbsp; &nbsp;1.&nbsp;<span
     * style="font-family:宋体">抗性淀粉</span></p><p><br/></p><p><span
     * style="font-family:宋体">一种不能被人体消化的淀粉，青香蕉里最多，作用类似于膳食纤维。不过青香蕉鞣酸较多，容易引起便秘，所以<strong
     * >建议大家还是吃“熟到刚好”（既不要太青，也不要起黑点）的香蕉。</strong></span></p><p>&nbsp;</p><p>&nbsp; &nbsp;2.&nbsp;
     * <span style="font-family:宋体">果胶</span></p><p><br/></p><p><span
     * style="font-family:宋体">一种水溶性纤维。同样，熟到刚好的香蕉里果胶含量较多，熟透则变少。</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">这两种纤维对于减脂的好处包括：</span></p><p>&nbsp;</p><blockquote><p><span
     * style="font-family:宋体">增加饱腹感；</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">促进排便（记住哦，减肥的重中之重就是改善便秘！没有排出体外的脂肪是会被再次吸收利用的！）</span></p><p>&nbsp;
     * </p><p><span style="font-family:宋体">降低餐后血糖（餐后血糖越低，糖分越不容易转化成脂肪！）</span></p><p>&nbsp;
     * </p><p><span style="font-family:宋体">促进肠道益生菌的生长（益生菌越多，越能够阻止身体对脂肪的吸收和利用！）</span></p
     * ></blockquote><p>&nbsp;</p><p><strong><span style="font-family: 宋体;">成份二</span>：<span
     * style="font-family: 宋体;">钾</span></strong></p><p><br/></p><p><span
     * style="font-family:宋体">你以为钾听起来和减肥没啥关系？错了！钾钠平衡知道不？</span></p><p>&nbsp;
     * </p><blockquote><p><strong><span style="font-family:宋体">多吃盐</span>=<span
     * style="font-family: 宋体">多吃钠</span>=<span style="font-family:宋体">身体水肿</span>=<span
     * style="font-family: 宋体">外形差</span>=<span
     * style="font-family:宋体">体重升</span></strong></p><p><strong>&nbsp;
     * </strong></p><p><strong><span style="font-family:宋体">多吃钾</span>=<span style="font-family:
     * 宋体">排出钠</span>=<span style="font-family:宋体">退水肿</span>=<span style="font-family:
     * 宋体">苗条身材</span>=<span style="font-family:宋体">体重降</span></strong></p><p>&nbsp;
     * </p></blockquote><p><span style="font-family:宋体">这个逻辑是不是很清晰？</span></p><p>&nbsp;
     * </p><p><strong>四、<span style="font-family: 宋体;
     * ">减脂的时候，香蕉到底能不能吃？怎么吃？</span></strong></p><p>&nbsp;</p><p><strong><span
     * style="font-family:宋体">香蕉减脂期间能不能吃？能吃！增肌能吃，减脂也能吃！</span></strong><span
     * style="font-family:宋体">但是，为了让大家充分受益于香蕉的健康功效，</span>Keep<span style="font-family:宋体">君
     * 还是谨慎地为大家制定了一些吃香蕉的「原则和底线」：</span></p><p>&nbsp;</p><p>&nbsp; &nbsp;1.&nbsp;<span
     * style="font-family: 宋体;">可以把香蕉作为主食</span></p><p><br/></p><p><span
     * style="font-family:宋体">一次吃一根中等尺寸的香蕉刚好。可以在</span><strong><span
     * style="font-family:宋体">正餐前&nbsp;</span>20-30&nbsp;<span
     * style="font-family:宋体">分钟吃</span></strong><span
     * style="font-family:宋体">，然后正餐吃一些干净、少油的蔬菜和肉类。</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">换而言之，你吃了香蕉，同一餐就不要再摄入其它类型的主食（土豆、红薯、米饭、面条、包子等）以及水果。</span></p><p
     * >&nbsp;</p><p>&nbsp; &nbsp;2.&nbsp;<span
     * style="font-family:宋体">运动前后可以吃香蕉</span></p><p>&nbsp;</p><p><span
     * style="font-family:宋体">运动前后身体需要快速能量，这时候的摄入可以最大化利用香蕉中的糖分（运动前后&nbsp;</span>30-45&nbsp;<span
     * style="font-family:宋体">分钟可以吃，具体情况视个人消化情况而定）。</span></p><p>&nbsp;</p><p>&nbsp; &nbsp;3
     * .&nbsp;<span style="font-family:宋体">不要和酸奶</span>/<span
     * style="font-family:宋体">牛奶一起吃</span></p><p><img src="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png" title="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png" alt="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336b0fe8800000.png"/></p><p><span
     * style="font-family:宋体">酸奶和牛奶含有很多乳糖（也属于快糖）。还有些豆奶、巧克力奶又额外添加了糖分；加上香蕉中的淀粉、葡萄糖、果糖，<strong
     * >容易导致同时摄入过多的快糖，非常不健康</strong>。喜欢奶昔的朋友尤其要注意这点！</span></p><p>&nbsp;</p><p>&nbsp; &nbsp;4
     * .&nbsp;<span style="font-family:宋体">不要吃大果盘</span>&nbsp;</p><p><img src="http://static1
     * .gotokeep.com/misc/2016/05/20/18/55336a706fc00000.png" title="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336a706fc00000.png" alt="http://static1.gotokeep
     * .com/misc/2016/05/20/18/55336a706fc00000.png"/></p><p>&nbsp;<span style="font-family: 宋体;
     * ">尽管水果属于低脂，高纤维食材，但<strong>过多的果糖只会让你越来越胖，阻碍减脂</strong>。好东西不代表多多益善，适量很重要。</span></p><p
     * >&nbsp;</p><p>&nbsp; &nbsp;5.&nbsp;<span
     * style="font-family:宋体">不要和坚果一起吃</span></p><p><br/></p><p><strong><span
     * style="font-family:宋体">糖和脂肪的摄入永远要成反比</span></strong><span
     * style="font-family:宋体">！坚果的主要成份就是脂肪，而香蕉的主要成份是糖。这两者尽量不要一起吃！</span></p><p>&nbsp;
     * </p><p>&nbsp; &nbsp;6.&nbsp;<span style="font-family:宋体">吃「熟到刚好」的香蕉</span></p><p><img
     * src="http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000.png"
     * title="http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000.png"
     * alt="http://static1.gotokeep.com/misc/2016/05/20/18/55336a9c8d800000.png"/></p><p>&nbsp;
     * </p><p><span
     * style="font-family:宋体">太青（生）的香蕉，可能会导致消化不良以及便秘；太熟（发黑）的香蕉含糖和纤维量又会下降。所以要吃「熟到刚好」，或者说「<strong
     * >呈亮黄色，表皮光滑坚实</strong>」的香蕉，此时它对于健康的益处最大。</span></p><p><span
     * style="font-family:宋体"><br/></span></p><p><span
     * style="font-family:宋体">关于香蕉你还有什么要问的吗？在下面的留言区和大家一起聊聊吧~</span></p><p><br/></p><p
     * style="white-space: normal;"><span style="font-size: 14px; color: rgb(127, 127, 127);
     * ">@&nbsp;<a
     * href="http://show.gotokeep.com/users/549cd5697e7ed6ee5c94ba4b" target="_self"
     * textvalue="Keep_技术分享">Keep_技术分享</a>&nbsp;，带你了解更多专业健身知识&nbsp;；</span></p><p
     * style="white-space: normal;"><span style="font-size: 14px; color: rgb(127, 127, 127);
     * ">@&nbsp;
     * <a href="http://show.gotokeep.com/users/56178e241779a99315da9373" target="_self" textvalue="Keep_精选">Keep_精选</a>&nbsp; ，和你分享&nbsp;Keepers 自己的故事、经验和心得，还有精挑细选的装备供你种草；</span></p><p style="white-space: normal;"><span style="font-size: 14px; color: rgb(127, 127, 127);">@&nbsp;<a href="http://show.gotokeep.com/users/55ac969edceb3b0fdf13bcfd" target="_self">Keep_吃惑</a>&nbsp;&nbsp;学习营养饮食知识、学做健身餐；</span></p><p style="white-space: normal;"><span style="font-size: 14px; color: rgb(127, 127, 127);">@&nbsp;<a href="http://show.gotokeep.com/users/56d3fe83ca2f02ff1310b1e6" target="_self">Keep_活动</a>&nbsp;&nbsp;，在这里找到新活动和获奖名单；</span></p><p style="white-space: normal;"><span style="font-size: 14px; color: rgb(127, 127, 127);">@&nbsp;<a href="http://show.gotokeep.com/users/54bf30dd9eb5cd2c4c90be46" target="_self">Keep</a>&nbsp;&nbsp;，Keep&nbsp;发生的大事都在这儿~</span></p><p style="white-space: normal;"><span style="color: rgb(127, 127, 127);"><span style="font-size: 14px;">想要玩转Keep，就关注起来吧~</span></span></p><p><br/></p>
     * photo : http://static1.gotokeep.com/misc/2016/05/20/18/55336c014c000000.jpg
     * title : 因为淀粉惧怕香蕉？难怪你会减脂失败！
     * content : 为什么说香蕉会让人长胖？是淀粉么？香蕉里具体有什么成份？如果你也有这些疑惑，一定不能错过这篇文章！
     * author : {"_id":"55ac969edceb3b0fdf13bcfd","id":"55ac969edceb3b0fdf13bcfd",
     * "created":"2015-07-20T06:35:10.000Z","username":"Keep_吃惑","avatar":"http://static1
     * .gotokeep.com/avatar/2016/02/17/15/19870d900ac396b892567b96f3398f99c0042d13.jpg",
     * "gender":"M"}
     * __v : 0
     * modified : 2016-05-20T10:42:33.515Z
     * stateValue : 20
     * state : normal
     * achievements : []
     * viewCount : 1
     * favoriteCount : 1838
     * contentType : []
     * type : article
     * geo : []
     * noise : false
     * public : true
     * likes : 11
     * comments : 102
     * meta : {"name":" 专题 ","count":1}
     * created : 2016-05-20T10:42:10.000Z
     * id : 573eea02cc0656c905df4110
     * commentsList : [{"__v":"0","content":"我感觉越吃越饿( \u2022̥́ ˍ \u2022̀ू )",
     * "author":{"_id":"55aa025a58b9aa08de4561b1","id":"55aa025a58b9aa08de4561b1",
     * "created":"2015-07-18T07:38:02.000Z","username":"muggle心烧","avatar":"http://static1
     * .gotokeep.com/avatar/2016/03/20/21/9331523bf90b566644696ba8bcfe8d21f4b752a1.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:40:59
     * GMT+0800 (CST)","_id":"5740494b701a69c75154d543","stateValue":20,"state":"normal",
     * "created":"2016-05-21T11:40:59.000Z","id":"5740494b701a69c75154d543"},{"__v":"0",
     * "content":"以后得改方式了😌","reply":"573fc8707f862161204df54e",
     * "author":{"_id":"569afb21a0ffef6457b89387","id":"569afb21a0ffef6457b89387",
     * "created":"2016-01-17T02:23:29.000Z","username":"Yukinly","avatar":"http://static1
     * .gotokeep.com/avatar/2016/03/18/09/4f7e70c43f5c083a263fb59d5b8293bab1a26945.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:37:06
     * GMT+0800 (CST)","_id":"574048629b5c6b3a057ec22d","stateValue":20,"state":"normal",
     * "created":"2016-05-21T11:37:06.000Z","id":"574048629b5c6b3a057ec22d",
     * "replyComment":{"author":{"_id":"567e3dee9554e02963507303",
     * "id":"567e3dee9554e02963507303","created":"2015-12-26T07:12:46.000Z","username":"丨开心丨",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/04/15/15/ed75fab3e78975d45419d5b3f173ce39b1f89cd3.jpg"},
     * "content":"一样的，我经常是水果和酸奶，还天真的以为比较减肥，，。"}},{"__v":"0","content":"吃香蕉的姿势有要求吗？",
     * "author":{"_id":"56538fbe3ccbebd49aeb8186","id":"56538fbe3ccbebd49aeb8186",
     * "created":"2015-11-23T22:14:22.000Z","username":"胡安冬","avatar":"http://static1.gotokeep
     * .com/avatar/2015/12/02/08/a81faec6d38a9f5a472a651240b7c68471e768ae.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 19:25:07
     * GMT+0800 (CST)","_id":"574045931f66434605f77682","stateValue":20,"state":"normal",
     * "created":"2016-05-21T11:25:07.000Z","id":"574045931f66434605f77682"},{"__v":"0",
     * "content":"嗯嗯，我的个人看法而已","reply":"57403c63cd90812c0533966c",
     * "author":{"_id":"55b81ec6b876283b67240eb1","id":"55b81ec6b876283b67240eb1",
     * "created":"2015-07-29T00:31:02.000Z","username":"毛小毛啦啦啦","avatar":"http://static1.gotokeep
     * .com/avatar/2016/00/29/08/e3819ae7c5acd87e2d7c774d4dafd85443995f42.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:52:27
     * GMT+0800 (CST)","_id":"57403debb020809e18de92fe","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:52:27.000Z","id":"57403debb020809e18de92fe",
     * "replyComment":{"author":{"_id":"567168bbb5ebf10c02e5ab3e",
     * "id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},
     * "content":"\u2026\u2026你觉得\u2026\u2026"}},{"__v":"0","content":"晚餐吃一个香蕉和一个苹果行吗",
     * "author":{"_id":"573fd95423ba3fe3514f6327","id":"573fd95423ba3fe3514f6327",
     * "created":"2016-05-21T03:43:16.000Z","username":"sunset_1","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/CC6408C786C993628586843CB16ECB9B/100"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:51:15
     * GMT+0800 (CST)","_id":"57403da34b7316240533027c","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:51:15.000Z","id":"57403da34b7316240533027c"},{"__v":"0",
     * "content":"一天吃多少香蕉比较好呢？","author":{"_id":"56a2b2d71764e8e54785f403",
     * "id":"56a2b2d71764e8e54785f403","created":"2016-01-22T22:53:11.000Z","username":"运动1357",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/03/23/22/bfecd7b7e0852cfcb8e5d6903c891630879b1d12.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:48:18
     * GMT+0800 (CST)","_id":"57403cf270c9404805cee973","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:48:18.000Z","id":"57403cf270c9404805cee973"},{"__v":"0",
     * "content":"干货满满，果断收藏。","author":{"_id":"567168bbb5ebf10c02e5ab3e",
     * "id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:47:00
     * GMT+0800 (CST)","_id":"57403ca44c006ece1876fb5a","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:47:00.000Z","id":"57403ca44c006ece1876fb5a"},{"__v":"0",
     * "content":"\u2026\u2026你觉得\u2026\u2026","reply":"573f91539d94a5d751a9608a",
     * "author":{"_id":"567168bbb5ebf10c02e5ab3e","id":"567168bbb5ebf10c02e5ab3e",
     * "created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢","avatar":"http://static1.gotokeep
     * .com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","modified":"Sat May 21 2016 18:45:55
     * GMT+0800 (CST)","_id":"57403c63cd90812c0533966c","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:45:55.000Z","id":"57403c63cd90812c0533966c",
     * "replyComment":{"author":{"_id":"55b81ec6b876283b67240eb1",
     * "id":"55b81ec6b876283b67240eb1","created":"2015-07-29T00:31:02.000Z","username":"毛小毛啦啦啦",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/00/29/08/e3819ae7c5acd87e2d7c774d4dafd85443995f42.jpg"},
     * "content":"我都是酸奶拌香蕉吃的！补充蛋白质和能量！我觉得应该可以的吧"}},{"_id":"5740388fca2d53fb51502277",
     * "content":"可以当早餐吃么？","author":{"_id":"5735e1995b51cbcb36cac746",
     * "id":"5735e1995b51cbcb36cac746","created":"2016-05-13T14:15:53.000Z","username":"Ms-夏",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/05/13/22/e3ec54c4e671de9f4b73858c54601ef8e1e3f156.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 18:29:35 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T10:29:35.000Z","id":"5740388fca2d53fb51502277"},
     * {"content":"吃惑君之前说过饮食比例4:4:2，是质量比还是热量比，具体怎么计算？基础代谢率和每天所需热量怎么计算，请吃惑君解答。","modified":"Sat
     * May 21 2016 17:45:29 GMT+0800 (CST)","refe":"573eea02cc0656c905df4110",
     * "id":"57402e39d5d2951e5dda4653","stateValue":20,"created":"2016-05-21T09:45:29.000Z",
     * "refe_type":"entry","__v":"0","author":{"_id":"56eddc7d63b07e0175b5c34c",
     * "id":"56eddc7d63b07e0175b5c34c","created":"2016-03-19T23:10:53.000Z",
     * "username":"桃之夭夭8866","avatar":""},"state":"normal","_id":"57402e39d5d2951e5dda4653"},
     * {"content":"每天我都是吃饭完了 两个小时后吃一根请问可以吗","author":{"_id":"56e17d86f598531405a77430",
     * "id":"56e17d86f598531405a77430","created":"2016-03-10T13:58:30.000Z","username":"Ccc上心",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/03/10/21/148842933136f746e227301a8551e6ba4687e16c.jpg"},"__v":"0",
     * "refe":"573eea02cc0656c905df4110","modified":"Sat May 21 2016 17:41:59 GMT+0800 (CST)",
     * "refe_type":"entry","_id":"57402d670fac794261887fb6","stateValue":20,
     * "created":"2016-05-21T09:41:59.000Z","id":"57402d670fac794261887fb6","state":"normal"},
     * {"_id":"5740249c1826cd2a61baa3c7","content":"@宋嘉楠7了个七小萝卜",
     * "author":{"_id":"56adef0b0491676438307a2c","id":"56adef0b0491676438307a2c",
     * "created":"2016-01-31T11:24:59.000Z","username":"Jwlovescarrot","avatar":"http://static1
     * .gotokeep.com/avatar/2016/01/31/19/698281ebd90c099d5fb46293c22561c28d05ef23.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 17:04:28 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T09:04:28.000Z","id":"5740249c1826cd2a61baa3c7"},
     * {"_id":"574016e4cae475075215fbe3","content":"早上爱吃微微有些涩的香蕉 熟透的不爱吃",
     * "author":{"_id":"55da78dde4a0c9a765f3b310","id":"55da78dde4a0c9a765f3b310",
     * "created":"2015-08-24T01:52:29.000Z","username":"家里猫","avatar":"http://static1.gotokeep
     * .com/avatar/2015/09/19/15/cf5c1464dc4c811ff80face2ab7262ff278d4551.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 16:05:56 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T08:05:56.000Z","id":"574016e4cae475075215fbe3"},{"modified":"Sat May
     * 21 2016 15:53:36 GMT+0800 (CST)","__v":"0","_id":"57401400617ac3135d9890cb",
     * "refe_type":"entry","refe":"573eea02cc0656c905df4110","stateValue":20,
     * "content":"这样很好啊！小编说不能混酸奶，是因为买来的酸奶都已经加了很多的糖，你的自制酸奶没有糖，所以不会引起糖分超标的。",
     * "created":"2016-05-21T07:53:36.000Z","state":"normal",
     * "author":{"_id":"563b0b3b09056c5eed6eaa6d","id":"563b0b3b09056c5eed6eaa6d",
     * "created":"2015-11-05T07:54:35.000Z","username":"王园子","avatar":"http://static1.gotokeep
     * .com/avatar/2015/11/05/15/03241a0e18994e9db72d20a56296f5864e21fd9b.jpg"},
     * "reply":"573f0a09526b425161dc5859","id":"57401400617ac3135d9890cb",
     * "replyComment":{"author":{"_id":"5665aee7647b333705be73cf",
     * "id":"5665aee7647b333705be73cf","created":"2015-12-07T16:08:07.000Z","username":"牛头尊",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/00/05/16/150e8576c45605b787bb56f1317d38a93850c2d3.jpg"},
     * "content":"。。我老是把香蕉扮到酸奶里面代替糖。。。。酸奶是自己用酸奶机做的那种。。"}},{"_id":"574011f70b8f0af518ed0e89",
     * "content":"我似乎很喜欢饭后吃一根香蕉。。。天。","author":{"_id":"562b2bec2daf999381da0262",
     * "id":"562b2bec2daf999381da0262","created":"2015-10-24T06:57:48.000Z","username":"莹小胖",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/04/21/15/9da2c0e5d2a23870ed855098bd61f4275e44ce7f.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 15:44:55 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T07:44:55.000Z","id":"574011f70b8f0af518ed0e89"},
     * {"_id":"574006879d94a5d751aad04c","content":"我想知道薯类  如红薯  紫薯  能不能减肥",
     * "author":{"_id":"572895d7e31a8d270503bf15","id":"572895d7e31a8d270503bf15",
     * "created":"2016-05-03T12:13:11.000Z","username":"50kgfighting","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/C4DCCAFE4FBC8C2A7D9A49D68264654E/100"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 14:56:07 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T06:56:07.000Z","id":"574006879d94a5d751aad04c"},
     * {"content":"如果酸奶/牛奶都不太适合和香蕉一起吃，那香蕉牛油果和牛奶混打岂不是超标了N多？一起吃只是不利于减脂其他的危害应该没有吧？","modified":"Sat
     * May 21 2016 14:51:14 GMT+0800 (CST)","refe":"573eea02cc0656c905df4110",
     * "id":"57400562d343387e6188bd80","stateValue":20,"created":"2016-05-21T06:51:14.000Z",
     * "refe_type":"entry","__v":"0","author":{"_id":"561f6aaa6916ec1a47b8b800",
     * "id":"561f6aaa6916ec1a47b8b800","created":"2015-10-15T08:58:18.000Z","username":"Mr_LeeJ",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2015/10/21/22/e2832dd47bf9c19a052f62461ab71b510023063f.jpg"},"state":"normal",
     * "_id":"57400562d343387e6188bd80"},{"_id":"573fffd3617ac3135d983d59","content":"吃什么有助于减肥",
     * "author":{"_id":"573fed90a52a465b5ddf10af","id":"573fed90a52a465b5ddf10af",
     * "created":"2016-05-21T05:09:36.000Z","username":"13411913547","avatar":"http://q.qlogo
     * .cn/qqapp/1103727446/159C525FE0C10E2CCBBFCCBF9C9BB5AA/100"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 14:27:31 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T06:27:31.000Z","id":"573fffd3617ac3135d983d59"},
     * {"_id":"573ff62ca52a465b5ddf2bda","author":{"_id":"557fff360a07217bbb93bc7b",
     * "id":"557fff360a07217bbb93bc7b","created":"2015-06-16T10:49:26.000Z","username":"大脸猫-M",
     * "avatar":"http://static1.gotokeep
     * .com/avatar/2016/01/07/14/23421165df8a3b56dc924da83cc6b0cace2a11e8.jpg"},
     * "refe":"573eea02cc0656c905df4110","__v":"0","content":"keep君，下期说说红薯能不能帮助减脂吧，拜托拜托😘",
     * "state":"normal","id":"573ff62ca52a465b5ddf2bda","stateValue":20,"refe_type":"entry",
     * "modified":"Sat May 21 2016 13:46:20 GMT+0800 (CST)","created":"2016-05-21T05:46:20
     * .000Z"},{"_id":"573feb3f4f56ffe6187bad68","content":"又get到新知识了",
     * "author":{"_id":"570cf888fe607a0f7a201c52","id":"570cf888fe607a0f7a201c52",
     * "created":"2016-04-12T13:30:48.000Z","username":"CQ小子","avatar":"http://static1.gotokeep
     * .com/avatar/2016/03/12/21/8b7d4ff1b567b8262703a5d6c73a5a5fd0b23602.jpg"},
     * "refe":"573eea02cc0656c905df4110","refe_type":"entry","__v":"0","modified":"Sat May 21
     * 2016 12:59:43 GMT+0800 (CST)","stateValue":20,"state":"normal",
     * "created":"2016-05-21T04:59:43.000Z","id":"573feb3f4f56ffe6187bad68"}]
     * hasLiked : false
     * likers : [{"_id":"57401dbb526b425161dfb494","id":"57401dbb526b425161dfb494",
     * "created":"2016-05-21T08:35:07.000Z","avatar":"http://wx.qlogo
     * .cn/mmopen/azHWq9JzsibBOic02WHxPDCNAlT3C8FDia0v6HprpnbDorNSIicTb8Qpc7SoFWwjA6ickT0GkoiaiaxP5Eqk4k4MfeuvlF0XsLLv46C/0"},{"_id":"5655d03f77172073d697e3ef","id":"5655d03f77172073d697e3ef","created":"2015-11-25T15:14:07.000Z","avatar":""},{"_id":"573953c926911ac00c3da228","id":"573953c926911ac00c3da228","created":"2016-05-16T04:59:53.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/D0B8735C164928F14468628BBDADD548/100"},{"_id":"573fe64071d560da18def2c7","id":"573fe64071d560da18def2c7","created":"2016-05-21T04:38:24.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/188143304D7A14AE99C6A59C84232504/100"},{"_id":"573fe007d3d7aaef5138f089","id":"573fe007d3d7aaef5138f089","created":"2016-05-21T04:11:51.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/04/21/12/e95f3d66d9fa2ea36af6d75a02cf497e5cba7c04.jpg"},{"_id":"573faf0f4e39594c5d124e81","id":"573faf0f4e39594c5d124e81","created":"2016-05-21T00:42:55.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/3056B21138CA0B351DF0C3ED1F0604BE/100"},{"_id":"573dbab305150b2305bea2f5","id":"573dbab305150b2305bea2f5","created":"2016-05-19T13:08:03.000Z","avatar":""},{"_id":"56af276591f87cca33c9dce3","id":"56af276591f87cca33c9dce3","created":"2016-02-01T09:37:41.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/50EFF77157579170ED69E9319D08385B/100"},{"_id":"573f2dc4c0788c12615d1934","id":"573f2dc4c0788c12615d1934","created":"2016-05-20T15:31:16.000Z","avatar":"http://q.qlogo.cn/qqapp/1103727446/279E40DDA81911FD8CCE4A2430D37E27/100"},{"_id":"573f0c6f180e4e315d651e9f","id":"573f0c6f180e4e315d651e9f","created":"2016-05-20T13:09:03.000Z","avatar":"http://static1.gotokeep.com/avatar/2016/04/20/21/c0822d432f9614bd64d513d5c644298cd0d4dc38.jpg"}]
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
        private String html;
        private String photo;
        private String title;
        private String content;
        /**
         * _id : 55ac969edceb3b0fdf13bcfd
         * id : 55ac969edceb3b0fdf13bcfd
         * created : 2015-07-20T06:35:10.000Z
         * username : Keep_吃惑
         * avatar : http://static1.gotokeep
         * .com/avatar/2016/02/17/15/19870d900ac396b892567b96f3398f99c0042d13.jpg
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
         * name :  专题
         * count : 1
         */

        private MetaBean meta;
        private String created;
        private String id;
        private boolean hasLiked;
        private boolean hasFavorited;
        private List<?> achievements;
        private List<?> contentType;
        private List<?> geo;
        /**
         * __v : 0
         * content : 我感觉越吃越饿( •̥́ ˍ •̀ू )
         * author : {"_id":"55aa025a58b9aa08de4561b1","id":"55aa025a58b9aa08de4561b1",
         * "created":"2015-07-18T07:38:02.000Z","username":"muggle心烧","avatar":"http://static1
         * .gotokeep.com/avatar/2016/03/20/21/9331523bf90b566644696ba8bcfe8d21f4b752a1.jpg"}
         * refe : 573eea02cc0656c905df4110
         * refe_type : entry
         * modified : Sat May 21 2016 19:40:59 GMT+0800 (CST)
         * _id : 5740494b701a69c75154d543
         * stateValue : 20
         * state : normal
         * created : 2016-05-21T11:40:59.000Z
         * id : 5740494b701a69c75154d543
         */

        private List<CommentsListBean> commentsList;
        /**
         * _id : 57401dbb526b425161dfb494
         * id : 57401dbb526b425161dfb494
         * created : 2016-05-21T08:35:07.000Z
         * avatar : http://wx.qlogo
         * .cn/mmopen/azHWq9JzsibBOic02WHxPDCNAlT3C8FDia0v6HprpnbDorNSIicTb8Qpc7SoFWwjA6ickT0GkoiaiaxP5Eqk4k4MfeuvlF0XsLLv46C/0
         */

        private List<LikersBean> likers;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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

        public List<?> getContentType() {
            return contentType;
        }

        public void setContentType(List<?> contentType) {
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
             * _id : 55aa025a58b9aa08de4561b1
             * id : 55aa025a58b9aa08de4561b1
             * created : 2015-07-18T07:38:02.000Z
             * username : muggle心烧
             * avatar : http://static1.gotokeep.com/avatar/2016/03/20/21/9331523bf90b566644696ba8bcfe8d21f4b752a1.jpg
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
             * reply : 57403c63cd90812c0533966c
             * replyComment : {"author":{"_id":"567168bbb5ebf10c02e5ab3e",
             * "id":"567168bbb5ebf10c02e5ab3e","created":"2015-12-16T13:35:55.000Z",
             * "username":"说谁肉多呢","avatar":"http://static1.gotokeep
             * .com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"},
             * "content":"\u2026\u2026你觉得\u2026\u2026"}
             */

            private String reply;
            /**
             * author : {"_id":"567168bbb5ebf10c02e5ab3e","id":"567168bbb5ebf10c02e5ab3e",
             * "created":"2015-12-16T13:35:55.000Z","username":"说谁肉多呢","avatar":"http://static1
             * .gotokeep.com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg"}
             * content : ……你觉得……
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
                 * _id : 567168bbb5ebf10c02e5ab3e
                 * id : 567168bbb5ebf10c02e5ab3e
                 * created : 2015-12-16T13:35:55.000Z
                 * username : 说谁肉多呢
                 * avatar : http://static1.gotokeep
                 * .com/avatar/2016/02/21/18/564aa29317fc0d11ed4bd37428e6e618fccf7382.jpg
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
