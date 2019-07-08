package com.vplan.backend.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1562150202256L;


    /**
    * 主键
    * id，长度8-16，字母数字与_
    * isNullAble:0
    */
    private String user_id;

    /**
    * 姓名
    * isNullAble:1
    */
    private String user_name;

    /**
    * 密码
    * isNullAble:1
    */
    private String password;

    /**
    * 充值余额，土豪币
    * isNullAble:1
    */
    private Double rmb;

    /**
    * 做题奖励，学霸券
    * isNullAble:1
    */
    private Double coin;

    /**
    * 地区
    * isNullAble:1
    */
    private String area;

    /**
    * 年级（010一年级上，011一年级下）
    * isNullAble:1
    */
    private Integer level;


    public void setUser_id(String user_id){this.user_id = user_id;}

    public String getUser_id(){return this.user_id;}

    public void setUser_name(String user_name){this.user_name = user_name;}

    public String getUser_name(){return this.user_name;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setRmb(Double rmb){this.rmb = rmb;}

    public Double getRmb(){return this.rmb;}

    public void setCoin(Double coin){this.coin = coin;}

    public Double getCoin(){return this.coin;}

    public void setArea(String area){this.area = area;}

    public String getArea(){return this.area;}

    public void setLevel(Integer level){this.level = level;}

    public Integer getLevel(){return this.level;}
    @Override
    public String toString() {
        return "UserModel{" +
                "user_id='" + user_id + '\'' +
                "user_name='" + user_name + '\'' +
                "password='" + password + '\'' +
                "rmb='" + rmb + '\'' +
                "coin='" + coin + '\'' +
                "area='" + area + '\'' +
                "level='" + level + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserModel set){
            this.set = set;
            return this;
        }

        public UserModel getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends UserModel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> user_idList;

        public List<String> getUser_idList(){return this.user_idList;}


        private List<String> fuzzyUser_id;

        public List<String> getFuzzyUser_id(){return this.fuzzyUser_id;}

        private List<String> rightFuzzyUser_id;

        public List<String> getRightFuzzyUser_id(){return this.rightFuzzyUser_id;}
        private List<String> user_nameList;

        public List<String> getUser_nameList(){return this.user_nameList;}


        private List<String> fuzzyUser_name;

        public List<String> getFuzzyUser_name(){return this.fuzzyUser_name;}

        private List<String> rightFuzzyUser_name;

        public List<String> getRightFuzzyUser_name(){return this.rightFuzzyUser_name;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<Double> rmbList;

        public List<Double> getRmbList(){return this.rmbList;}

        private Double rmbSt;

        private Double rmbEd;

        public Double getRmbSt(){return this.rmbSt;}

        public Double getRmbEd(){return this.rmbEd;}

        private List<Double> coinList;

        public List<Double> getCoinList(){return this.coinList;}

        private Double coinSt;

        private Double coinEd;

        public Double getCoinSt(){return this.coinSt;}

        public Double getCoinEd(){return this.coinEd;}

        private List<String> areaList;

        public List<String> getAreaList(){return this.areaList;}


        private List<String> fuzzyArea;

        public List<String> getFuzzyArea(){return this.fuzzyArea;}

        private List<String> rightFuzzyArea;

        public List<String> getRightFuzzyArea(){return this.rightFuzzyArea;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyUser_id (List<String> fuzzyUser_id){
            this.fuzzyUser_id = fuzzyUser_id;
            return this;
        }

        public QueryBuilder fuzzyUser_id (String ... fuzzyUser_id){
            this.fuzzyUser_id = solveNullList(fuzzyUser_id);
            return this;
        }

        public QueryBuilder rightFuzzyUser_id (List<String> rightFuzzyUser_id){
            this.rightFuzzyUser_id = rightFuzzyUser_id;
            return this;
        }

        public QueryBuilder rightFuzzyUser_id (String ... rightFuzzyUser_id){
            this.rightFuzzyUser_id = solveNullList(rightFuzzyUser_id);
            return this;
        }

        public QueryBuilder user_id(String user_id){
            setUser_id(user_id);
            return this;
        }

        public QueryBuilder user_idList(String ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public QueryBuilder user_idList(List<String> user_id){
            this.user_idList = user_id;
            return this;
        }

        public QueryBuilder fetchUser_id(){
            setFetchFields("fetchFields","user_id");
            return this;
        }

        public QueryBuilder excludeUser_id(){
            setFetchFields("excludeFields","user_id");
            return this;
        }

        public QueryBuilder fuzzyUser_name (List<String> fuzzyUser_name){
            this.fuzzyUser_name = fuzzyUser_name;
            return this;
        }

        public QueryBuilder fuzzyUser_name (String ... fuzzyUser_name){
            this.fuzzyUser_name = solveNullList(fuzzyUser_name);
            return this;
        }

        public QueryBuilder rightFuzzyUser_name (List<String> rightFuzzyUser_name){
            this.rightFuzzyUser_name = rightFuzzyUser_name;
            return this;
        }

        public QueryBuilder rightFuzzyUser_name (String ... rightFuzzyUser_name){
            this.rightFuzzyUser_name = solveNullList(rightFuzzyUser_name);
            return this;
        }

        public QueryBuilder user_name(String user_name){
            setUser_name(user_name);
            return this;
        }

        public QueryBuilder user_nameList(String ... user_name){
            this.user_nameList = solveNullList(user_name);
            return this;
        }

        public QueryBuilder user_nameList(List<String> user_name){
            this.user_nameList = user_name;
            return this;
        }

        public QueryBuilder fetchUser_name(){
            setFetchFields("fetchFields","user_name");
            return this;
        }

        public QueryBuilder excludeUser_name(){
            setFetchFields("excludeFields","user_name");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder rmbBetWeen(Double rmbSt,Double rmbEd){
            this.rmbSt = rmbSt;
            this.rmbEd = rmbEd;
            return this;
        }

        public QueryBuilder rmbGreaterEqThan(Double rmbSt){
            this.rmbSt = rmbSt;
            return this;
        }
        public QueryBuilder rmbLessEqThan(Double rmbEd){
            this.rmbEd = rmbEd;
            return this;
        }


        public QueryBuilder rmb(Double rmb){
            setRmb(rmb);
            return this;
        }

        public QueryBuilder rmbList(Double ... rmb){
            this.rmbList = solveNullList(rmb);
            return this;
        }

        public QueryBuilder rmbList(List<Double> rmb){
            this.rmbList = rmb;
            return this;
        }

        public QueryBuilder fetchRmb(){
            setFetchFields("fetchFields","rmb");
            return this;
        }

        public QueryBuilder excludeRmb(){
            setFetchFields("excludeFields","rmb");
            return this;
        }

        public QueryBuilder coinBetWeen(Double coinSt,Double coinEd){
            this.coinSt = coinSt;
            this.coinEd = coinEd;
            return this;
        }

        public QueryBuilder coinGreaterEqThan(Double coinSt){
            this.coinSt = coinSt;
            return this;
        }
        public QueryBuilder coinLessEqThan(Double coinEd){
            this.coinEd = coinEd;
            return this;
        }


        public QueryBuilder coin(Double coin){
            setCoin(coin);
            return this;
        }

        public QueryBuilder coinList(Double ... coin){
            this.coinList = solveNullList(coin);
            return this;
        }

        public QueryBuilder coinList(List<Double> coin){
            this.coinList = coin;
            return this;
        }

        public QueryBuilder fetchCoin(){
            setFetchFields("fetchFields","coin");
            return this;
        }

        public QueryBuilder excludeCoin(){
            setFetchFields("excludeFields","coin");
            return this;
        }

        public QueryBuilder fuzzyArea (List<String> fuzzyArea){
            this.fuzzyArea = fuzzyArea;
            return this;
        }

        public QueryBuilder fuzzyArea (String ... fuzzyArea){
            this.fuzzyArea = solveNullList(fuzzyArea);
            return this;
        }

        public QueryBuilder rightFuzzyArea (List<String> rightFuzzyArea){
            this.rightFuzzyArea = rightFuzzyArea;
            return this;
        }

        public QueryBuilder rightFuzzyArea (String ... rightFuzzyArea){
            this.rightFuzzyArea = solveNullList(rightFuzzyArea);
            return this;
        }

        public QueryBuilder area(String area){
            setArea(area);
            return this;
        }

        public QueryBuilder areaList(String ... area){
            this.areaList = solveNullList(area);
            return this;
        }

        public QueryBuilder areaList(List<String> area){
            this.areaList = area;
            return this;
        }

        public QueryBuilder fetchArea(){
            setFetchFields("fetchFields","area");
            return this;
        }

        public QueryBuilder excludeArea(){
            setFetchFields("excludeFields","area");
            return this;
        }

        public QueryBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public QueryBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public QueryBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public QueryBuilder level(Integer level){
            setLevel(level);
            return this;
        }

        public QueryBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public QueryBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        public QueryBuilder fetchLevel(){
            setFetchFields("fetchFields","level");
            return this;
        }

        public QueryBuilder excludeLevel(){
            setFetchFields("excludeFields","level");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public UserModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> user_idList;

        public List<String> getUser_idList(){return this.user_idList;}


        private List<String> fuzzyUser_id;

        public List<String> getFuzzyUser_id(){return this.fuzzyUser_id;}

        private List<String> rightFuzzyUser_id;

        public List<String> getRightFuzzyUser_id(){return this.rightFuzzyUser_id;}
        private List<String> user_nameList;

        public List<String> getUser_nameList(){return this.user_nameList;}


        private List<String> fuzzyUser_name;

        public List<String> getFuzzyUser_name(){return this.fuzzyUser_name;}

        private List<String> rightFuzzyUser_name;

        public List<String> getRightFuzzyUser_name(){return this.rightFuzzyUser_name;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<Double> rmbList;

        public List<Double> getRmbList(){return this.rmbList;}

        private Double rmbSt;

        private Double rmbEd;

        public Double getRmbSt(){return this.rmbSt;}

        public Double getRmbEd(){return this.rmbEd;}

        private List<Double> coinList;

        public List<Double> getCoinList(){return this.coinList;}

        private Double coinSt;

        private Double coinEd;

        public Double getCoinSt(){return this.coinSt;}

        public Double getCoinEd(){return this.coinEd;}

        private List<String> areaList;

        public List<String> getAreaList(){return this.areaList;}


        private List<String> fuzzyArea;

        public List<String> getFuzzyArea(){return this.fuzzyArea;}

        private List<String> rightFuzzyArea;

        public List<String> getRightFuzzyArea(){return this.rightFuzzyArea;}
        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}


        public ConditionBuilder fuzzyUser_id (List<String> fuzzyUser_id){
            this.fuzzyUser_id = fuzzyUser_id;
            return this;
        }

        public ConditionBuilder fuzzyUser_id (String ... fuzzyUser_id){
            this.fuzzyUser_id = solveNullList(fuzzyUser_id);
            return this;
        }

        public ConditionBuilder rightFuzzyUser_id (List<String> rightFuzzyUser_id){
            this.rightFuzzyUser_id = rightFuzzyUser_id;
            return this;
        }

        public ConditionBuilder rightFuzzyUser_id (String ... rightFuzzyUser_id){
            this.rightFuzzyUser_id = solveNullList(rightFuzzyUser_id);
            return this;
        }

        public ConditionBuilder user_idList(String ... user_id){
            this.user_idList = solveNullList(user_id);
            return this;
        }

        public ConditionBuilder user_idList(List<String> user_id){
            this.user_idList = user_id;
            return this;
        }

        public ConditionBuilder fuzzyUser_name (List<String> fuzzyUser_name){
            this.fuzzyUser_name = fuzzyUser_name;
            return this;
        }

        public ConditionBuilder fuzzyUser_name (String ... fuzzyUser_name){
            this.fuzzyUser_name = solveNullList(fuzzyUser_name);
            return this;
        }

        public ConditionBuilder rightFuzzyUser_name (List<String> rightFuzzyUser_name){
            this.rightFuzzyUser_name = rightFuzzyUser_name;
            return this;
        }

        public ConditionBuilder rightFuzzyUser_name (String ... rightFuzzyUser_name){
            this.rightFuzzyUser_name = solveNullList(rightFuzzyUser_name);
            return this;
        }

        public ConditionBuilder user_nameList(String ... user_name){
            this.user_nameList = solveNullList(user_name);
            return this;
        }

        public ConditionBuilder user_nameList(List<String> user_name){
            this.user_nameList = user_name;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder rmbBetWeen(Double rmbSt,Double rmbEd){
            this.rmbSt = rmbSt;
            this.rmbEd = rmbEd;
            return this;
        }

        public ConditionBuilder rmbGreaterEqThan(Double rmbSt){
            this.rmbSt = rmbSt;
            return this;
        }
        public ConditionBuilder rmbLessEqThan(Double rmbEd){
            this.rmbEd = rmbEd;
            return this;
        }


        public ConditionBuilder rmbList(Double ... rmb){
            this.rmbList = solveNullList(rmb);
            return this;
        }

        public ConditionBuilder rmbList(List<Double> rmb){
            this.rmbList = rmb;
            return this;
        }

        public ConditionBuilder coinBetWeen(Double coinSt,Double coinEd){
            this.coinSt = coinSt;
            this.coinEd = coinEd;
            return this;
        }

        public ConditionBuilder coinGreaterEqThan(Double coinSt){
            this.coinSt = coinSt;
            return this;
        }
        public ConditionBuilder coinLessEqThan(Double coinEd){
            this.coinEd = coinEd;
            return this;
        }


        public ConditionBuilder coinList(Double ... coin){
            this.coinList = solveNullList(coin);
            return this;
        }

        public ConditionBuilder coinList(List<Double> coin){
            this.coinList = coin;
            return this;
        }

        public ConditionBuilder fuzzyArea (List<String> fuzzyArea){
            this.fuzzyArea = fuzzyArea;
            return this;
        }

        public ConditionBuilder fuzzyArea (String ... fuzzyArea){
            this.fuzzyArea = solveNullList(fuzzyArea);
            return this;
        }

        public ConditionBuilder rightFuzzyArea (List<String> rightFuzzyArea){
            this.rightFuzzyArea = rightFuzzyArea;
            return this;
        }

        public ConditionBuilder rightFuzzyArea (String ... rightFuzzyArea){
            this.rightFuzzyArea = solveNullList(rightFuzzyArea);
            return this;
        }

        public ConditionBuilder areaList(String ... area){
            this.areaList = solveNullList(area);
            return this;
        }

        public ConditionBuilder areaList(List<String> area){
            this.areaList = area;
            return this;
        }

        public ConditionBuilder levelBetWeen(Integer levelSt,Integer levelEd){
            this.levelSt = levelSt;
            this.levelEd = levelEd;
            return this;
        }

        public ConditionBuilder levelGreaterEqThan(Integer levelSt){
            this.levelSt = levelSt;
            return this;
        }
        public ConditionBuilder levelLessEqThan(Integer levelEd){
            this.levelEd = levelEd;
            return this;
        }


        public ConditionBuilder levelList(Integer ... level){
            this.levelList = solveNullList(level);
            return this;
        }

        public ConditionBuilder levelList(List<Integer> level){
            this.levelList = level;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private UserModel obj;

        public Builder(){
            this.obj = new UserModel();
        }

        public Builder user_id(String user_id){
            this.obj.setUser_id(user_id);
            return this;
        }
        public Builder user_name(String user_name){
            this.obj.setUser_name(user_name);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder rmb(Double rmb){
            this.obj.setRmb(rmb);
            return this;
        }
        public Builder coin(Double coin){
            this.obj.setCoin(coin);
            return this;
        }
        public Builder area(String area){
            this.obj.setArea(area);
            return this;
        }
        public Builder level(Integer level){
            this.obj.setLevel(level);
            return this;
        }
        public UserModel build(){return obj;}
    }

}
