package com.example.miniprogramme_springboot.recommend;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserCF_1 {
    final static int NEIGHBORHOOD_NUM = 20;
    final static int RECOMMENDER_NUM = 10;

    public Map<Long,Float> getusercf(int id) throws IOException, TasteException {
        Map<Long,Float> usercflist = new HashMap<>();
        String file = "src/main/resources/dataset/rating.csv";
        //文件前三列必须为用户id、物品id、评分
        DataModel model = new FileDataModel(new File(file));
        //datamodel是用户喜好信息的抽象接口，支持JDBCDataModel和FileDataModel数据库和文件
        UserSimilarity user = new EuclideanDistanceSimilarity(model);
        //usersimilarity用于定义两个用户间的相似度
        NearestNUserNeighborhood neighbor = new NearestNUserNeighborhood(NEIGHBORHOOD_NUM, user, model);
        //用于基于用户相似度的推荐方法中，推荐的内容是基于找到与当前用户喜好相似的邻居用户的方式产生
        Recommender r = new GenericUserBasedRecommender(model, neighbor, user);
        //推荐引擎的抽象接口，Taste中的核心组件
        LongPrimitiveIterator iter = model.getUserIDs();
        while (iter.hasNext()) {
            long uid = iter.nextLong();
            if(uid==id) {
                List<RecommendedItem> list = r.recommend(uid, RECOMMENDER_NUM);
//                System.out.printf("uid:%s", uid);
                for (RecommendedItem ritem : list) {
                    usercflist.put(ritem.getItemID(),ritem.getValue());
//                    System.out.printf("(%s,%f)", ritem.getItemID(), ritem.getValue());
                }
            }
//            System.out.println();
        }
//        System.out.println(usercflist);
        return usercflist;
    }
//    public static void main(String[] args) throws IOException, TasteException {
//        UserCF_1.usercf(1);
//    }

}



