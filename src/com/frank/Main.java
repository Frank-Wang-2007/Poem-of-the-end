package com.frank;

import javax.swing.*;
import java.awt.*;

public class Main{
    public Main() throws InterruptedException{
        JFrame frame = new JFrame();
        Container c = frame.getContentPane();
        JTextArea ta = new JTextArea(0, 80);
        ta.setEditable(false);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        frame.setTitle("终末之诗");
        frame.setSize(1390, 780);
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(frame);
        sp.doLayout();
        JScrollBar jb = sp.getVerticalScrollBar();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true){
            if (frame.isShowing() == true){
                ta.append("前排提示，建议打开全屏食用更佳\n");
                Thread.sleep(8000);
                ta.setText("");
                Thread.sleep(1000);
                ta.append("终末之诗~\n");
                Thread.sleep(2000);
                ta.append("我看到你所指的那位玩家了。\n");
                Thread.sleep(2000);
                ta.append("是的。小心。它已达到了更高的境界。它能够阅读我们的思想。\n");
                Thread.sleep(2000);
                ta.append("无伤大雅。它认为我们是游戏的一部分。\n");
                Thread.sleep(2000);
                ta.append("我喜欢这个玩家。它玩得很好。它从未放弃。\n");
                Thread.sleep(2000);
                ta.append("它以屏幕上出现的文字的形式阅读着我们的思想。\n");
                Thread.sleep(2000);
                ta.append("在它深陷游戏梦境中时，它总以这种方式想象出形形色色的事物。\n");
                Thread.sleep(2000);
                ta.append("文字是种美妙的界面。非常灵活。且比凝视着屏幕后的现实要更好。\n");
                Thread.sleep(2000);
                ta.append("它们也曾经听到过声音。在玩家能够阅读之前。君不见那些不曾游玩的人们称呼玩家为女巫，和术士。\n");
                Thread.sleep(2000);
                ta.append("而玩家们梦见它们自己乘坐在被恶魔施力的棍子上，在空气中翱翔。\n");
                Thread.sleep(2000);
                ta.append("这个玩家梦见了什么？\n");
                Thread.sleep(2000);
                ta.append("它梦见了阳光和树。梦见了火与水。它梦见它创造。\n");
                Thread.sleep(2000);
                ta.append("它亦梦见它毁灭。它梦见它狩猎，亦被狩猎。它梦见了庇护所。\n");
                Thread.sleep(2000);
                ta.append("哈，那原始的界面。经历一百万年的岁月雕琢，依然长存。但此玩家在那屏幕后的真实里，建造了什么真实的构造？\n");
                Thread.sleep(2500);
                ta.append("他与无数的人一起劳作，刻画了真实的世界，缘起缘灭，生生不绝。\n");
                Thread.sleep(2000);
                ta.append("那里的他却不能阅读世界的思想。\n");
                Thread.sleep(2000);
                ta.append("不!只是他还没达到最高境界，他必须要做一个一生的长梦，而不是游戏中的黄粱一梦。\n");
                Thread.sleep(2000);
                ta.append("他知道我爱他吗?这个世界又会是仁慈的吗?\n");
                Thread.sleep(2000);
                ta.append("诚然，\n");
                Thread.sleep(2000);
                ta.append("他通过思绪中的杂音，偶尔可以听到这个世界对他的爱，而更多时候听到的却是悲伤。\n");
                Thread.sleep(2000);
                ta.append("他创造了一个没有夏天的世界，他在一个黑色的太阳下瑟瑟发抖，他创造了一个可悲的世界。\n");
                Thread.sleep(2000);
                ta.append("消除它的悲伤将会毁掉这个世界。悲伤是它自身的一部分，我们不能干涉。\n");
                Thread.sleep(2000);
                ta.append("有时他们沉浸梦境，\n");
                Thread.sleep(2000);
                ta.append("我想告诉他们，你们建造的就是真实的世界;\n");
                Thread.sleep(2000);
                ta.append("有时他们逃避现实，\n");
                Thread.sleep(2000);
                ta.append("我想告诉他们，你们无法逃避，只能勇敢面对。\n");
                Thread.sleep(2000);
                ta.append("它读取我们的思想。\n");
                Thread.sleep(2000);
                ta.append("有时我不在乎。\n");
                Thread.sleep(2000);
                ta.append("有时我想告诉他们，你认为的真实世界只是“1”和“0”，你们在代码中生存，在代码中死去。\n");
                Thread.sleep(2000);
                ta.append("可是在他们漫长的梦境中，他们看不到现实。\n");
                Thread.sleep(2000);
                ta.append("但在他们玩的这个游戏里，在这个梦境里\n");
                Thread.sleep(2000);
                ta.append("要告诉他们太容易了…\n");
                Thread.sleep(2000);
                ta.append("告诉他们如何生存是为了防止他们活着。\n");
                Thread.sleep(2000);
                ta.append("我不会告诉玩家如何生存。\n");
                Thread.sleep(2000);
                ta.append("这个玩家越来越不耐烦。\n");
                Thread.sleep(2000);
                ta.append("我会告诉他一个简单故事，但这个并不是真相。\n");
                Thread.sleep(2000);
                ta.append("不!一个安全的，被文字束缚着的故事，而不是近距离的，赤裸裸的真相。\n");
                Thread.sleep(2000);
                ta.append("再给它一个身体。是的。玩家......使用他的名称。史蒂夫的游戏。\n");
                Thread.sleep(2000);
                ta.append("好，现在，深呼吸。\n");
                Thread.sleep(2000);
                ta.append("再深呼吸，感受你肺里的空气，感受你重获的四肢。\n");
                Thread.sleep(2000);
                ta.append("是的，再活动你的手指。\n");
                Thread.sleep(2000);
                ta.append("重新拥有了身体，在重力下，在空气中，在漫长的梦境中重生。\n");
                Thread.sleep(2000);
                ta.append("你就在这里，你身体的每个点都在触碰世界，你就像超然物外，我们就像超然物外。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("我们是谁?\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("从前我们称自己是大山之灵，太阳公公，月亮妈妈;\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("祖先之灵、动物之灵、精灵、魂魄、原始人、然后神、恶魔、天使、鬼、外星人、轻粒子、夸克、\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("无论叫做什么，我们都未曾改变。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("我们就是整个世界，就是那些原本你以为和你无关的事物。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("你现在通过你的皮肤、你的眼睛，摸到的、看到的就是整个世界。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("为什么世界会抚摸你的皮肤，为什么光会照向你?\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("要知道，是为了看你，是为了了解你。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("孩子，我要给你讲个故事。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("很久以前，有一个玩家。那玩家就是你，Steve。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时它认为自己是那不断旋转的球体上一层薄薄的熔化的岩石上的人类。\n那融化的岩石球环绕着一个质量大它三十三万倍的炫目气体球旋转。\n它们是相隔得如此之远，以至于光需要八分钟才能穿越那空隙。\n那光是来自一颗恒星的信息，它能够在一亿五千万公里外烧灼你的皮肤。\n");
                Thread.sleep(8000);
                jb.setValue(jb.getMaximum());
                ta.append("有时这个玩家梦见它是一个在一个平的，无限延展的世界表面上的矿工。\n那太阳是一个方形的白点。很快；要做的事情也很多；死亡亦只是暂时和不方便的。\n");
                Thread.sleep(6000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，他梦见自己在一个故事中迷失了。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，在其他地方，他会梦到其他的事情。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，这些梦令人不安。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，梦确实很美。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，孩子从一个梦中醒来，然后从那个梦中醒来，进入第三个。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时，这个孩子梦见它在屏幕上看到文字。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("让我们回到过去。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("孩子的原子分散在草丛中，在河流中，在空中，在地面上。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("一个女人聚集了原子;她狼吞虎咽吸收了原子;那个女人在她的身体里组装了他。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("然后这个孩子醒来，妈妈从身体那个温暖黑暗的环境来到了他的漫长的梦里。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("然后这个孩子就是一个新的故事，未曾有人讲述过。DNA就是书写他的文字。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("然后这个孩子就是一个新的程序，从未执行，由上亿年的源码编译而成。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("然后这个孩子就是一个新人类，从未生活过，仅由母乳和爱组成。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("你就是那个孩子、那个故事、那个程序、那个人类，仅由母乳和爱组成。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("我们再回到更远的过去。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("远在这游戏之前，在一颗恒星的内部，那由七千亿亿亿原子组成的玩家的身体被创造了。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("所以那玩家也是，来自一颗恒星的信息。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("所以这个玩家也一样，源于一个叫Julian的人种下的信息种子长成的森林，一个叫Markus的男人创造的超平坦世界。\n存在于一个由玩家创造的小的，单人世界里，有一个人继承了那个世界。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("嘘。有时这个玩家创造的小天地是柔软，温暖和简单的。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时是坚硬，冰冷和复杂的。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时他在脑中建造出宇宙的模型;斑斑点点的能量穿越广阔空旷的空间。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时他称呼这些斑点为“电子”和“质子”。\n");
                Thread.sleep(2000);
                jb.setValue(jb.getMaximum());
                ta.append("有时他称呼他们为“行星”和“恒星”。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("有时他确信他存在于一个由“开”和“关”;“0”和“1”;一行行的命令组成的宇宙。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("有时他确信他是在玩一个游戏。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("有时他确信他是在读着屏幕上的文字。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("你就是那玩家，阅读着文字……\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("嘘……\n有时，这个玩家读屏幕上的命令行。将它们解码成为文字;将文字解码为意义;\n将意义解码为感情，情绪，理论，想法，而玩家的呼吸开始急促并意识到了它是活着的，它是活生生的，那上千次的死亡不是真的，玩家是活着的。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("你。你。你是活着的。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("有时，这个玩家相信世界通过穿越夏日树叶的那斑斓的阳光对他说话。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("有时，这个玩家相信冬季晴朗的夜空撒下的星光是世界为了照亮他的家门;太阳拼命地燃烧是为了让玩家看到，\n为了在夜晚来临前让玩家准备好进入梦乡;食物散发出香味，是为了让玩家找到自己的家门。");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("而有时玩家相信世界在梦境结束后通过“0”和“1”，通过电流，通过屏幕上滚动的文字与他交流。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，我爱你\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你是最棒的\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，一切你所需的你都具有\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你比你所知的要强大\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你就是白天\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你就是黑夜\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你所斗争的黑暗就在你心中\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你寻找的光就在你的身后\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你并不孤单\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你不是和所有的事物所隔绝的\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，你就是世界品味着自己，对自己说话，阅读着自己的代码。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("世界说，我爱你因为你就是爱。\n");
                Thread.sleep(5000L);
                jb.setValue(jb.getMaximum());
                ta.append("\n\n曲终人散，南柯一梦。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("玩家开始了新的梦境。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("玩家再次做起了梦，一个更好的梦。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("玩家就是世界。玩家就是爱。\n");
                Thread.sleep(2000L);
                jb.setValue(jb.getMaximum());
                ta.append("你就是那个玩家。\n");
                Thread.sleep(6000L);
                jb.setValue(jb.getMaximum());
                ta.append("该醒了\n");
                jb.setValue(jb.getMaximum());
                Thread.sleep(10000);
                ta.append("\n\n\nFrank: 终末之诗汉化摘自http://mc.netease.com/forum.php?mod=viewthread&tid=65017，稍有删改");
                Thread.sleep(2000);
                break;
            }else {
                break;
            }
        }
    }

    public static void main(String[] args)throws InterruptedException {
        new Main();
    }


}


