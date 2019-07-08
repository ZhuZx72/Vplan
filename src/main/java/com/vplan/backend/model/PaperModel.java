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
public class PaperModel implements Serializable {

    private static final long serialVersionUID = 1562150191479L;


    /**
    * 主键
    * 试卷id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 试卷name
    * isNullAble:1
    */
    private String name;

    /**
    * 科目
    * isNullAble:1
    */
    private Integer subject;

    /**
    * 年级（010一年级上，011一年级下）
    * isNullAble:1
    */
    private Integer level;

    /**
    * 地区
    * isNullAble:1
    */
    private String area;

    /**
    * 来源（）
    * isNullAble:1
    */
    private String source;

    /**
    * 难度1：简单2：中等3：困难
    * isNullAble:1
    */
    private Integer difficulty;

    /**
    * 试卷土豪币价格
    * isNullAble:1
    */
    private Double pay_rmb;

    /**
    * 试卷学霸券价格，-1为不支持学霸券购买
    * isNullAble:1
    */
    private Double pay_coin;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setSubject(Integer subject){this.subject = subject;}

    public Integer getSubject(){return this.subject;}

    public void setLevel(Integer level){this.level = level;}

    public Integer getLevel(){return this.level;}

    public void setArea(String area){this.area = area;}

    public String getArea(){return this.area;}

    public void setSource(String source){this.source = source;}

    public String getSource(){return this.source;}

    public void setDifficulty(Integer difficulty){this.difficulty = difficulty;}

    public Integer getDifficulty(){return this.difficulty;}

    public void setPay_rmb(Double pay_rmb){this.pay_rmb = pay_rmb;}

    public Double getPay_rmb(){return this.pay_rmb;}

    public void setPay_coin(Double pay_coin){this.pay_coin = pay_coin;}

    public Double getPay_coin(){return this.pay_coin;}
    @Override
    public String toString() {
        return "PaperModel{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "subject='" + subject + '\'' +
                "level='" + level + '\'' +
                "area='" + area + '\'' +
                "source='" + source + '\'' +
                "difficulty='" + difficulty + '\'' +
                "pay_rmb='" + pay_rmb + '\'' +
                "pay_coin='" + pay_coin + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PaperModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(PaperModel set){
            this.set = set;
            return this;
        }

        public PaperModel getSet(){
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

    public static class QueryBuilder extends PaperModel{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> subjectList;

        public List<Integer> getSubjectList(){return this.subjectList;}

        private Integer subjectSt;

        private Integer subjectEd;

        public Integer getSubjectSt(){return this.subjectSt;}

        public Integer getSubjectEd(){return this.subjectEd;}

        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<String> areaList;

        public List<String> getAreaList(){return this.areaList;}


        private List<String> fuzzyArea;

        public List<String> getFuzzyArea(){return this.fuzzyArea;}

        private List<String> rightFuzzyArea;

        public List<String> getRightFuzzyArea(){return this.rightFuzzyArea;}
        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<Double> pay_rmbList;

        public List<Double> getPay_rmbList(){return this.pay_rmbList;}

        private Double pay_rmbSt;

        private Double pay_rmbEd;

        public Double getPay_rmbSt(){return this.pay_rmbSt;}

        public Double getPay_rmbEd(){return this.pay_rmbEd;}

        private List<Double> pay_coinList;

        public List<Double> getPay_coinList(){return this.pay_coinList;}

        private Double pay_coinSt;

        private Double pay_coinEd;

        public Double getPay_coinSt(){return this.pay_coinSt;}

        public Double getPay_coinEd(){return this.pay_coinEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder subjectBetWeen(Integer subjectSt,Integer subjectEd){
            this.subjectSt = subjectSt;
            this.subjectEd = subjectEd;
            return this;
        }

        public QueryBuilder subjectGreaterEqThan(Integer subjectSt){
            this.subjectSt = subjectSt;
            return this;
        }
        public QueryBuilder subjectLessEqThan(Integer subjectEd){
            this.subjectEd = subjectEd;
            return this;
        }


        public QueryBuilder subject(Integer subject){
            setSubject(subject);
            return this;
        }

        public QueryBuilder subjectList(Integer ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public QueryBuilder subjectList(List<Integer> subject){
            this.subjectList = subject;
            return this;
        }

        public QueryBuilder fetchSubject(){
            setFetchFields("fetchFields","subject");
            return this;
        }

        public QueryBuilder excludeSubject(){
            setFetchFields("excludeFields","subject");
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

        public QueryBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public QueryBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public QueryBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public QueryBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public QueryBuilder source(String source){
            setSource(source);
            return this;
        }

        public QueryBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public QueryBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public QueryBuilder fetchSource(){
            setFetchFields("fetchFields","source");
            return this;
        }

        public QueryBuilder excludeSource(){
            setFetchFields("excludeFields","source");
            return this;
        }

        public QueryBuilder difficultyBetWeen(Integer difficultySt,Integer difficultyEd){
            this.difficultySt = difficultySt;
            this.difficultyEd = difficultyEd;
            return this;
        }

        public QueryBuilder difficultyGreaterEqThan(Integer difficultySt){
            this.difficultySt = difficultySt;
            return this;
        }
        public QueryBuilder difficultyLessEqThan(Integer difficultyEd){
            this.difficultyEd = difficultyEd;
            return this;
        }


        public QueryBuilder difficulty(Integer difficulty){
            setDifficulty(difficulty);
            return this;
        }

        public QueryBuilder difficultyList(Integer ... difficulty){
            this.difficultyList = solveNullList(difficulty);
            return this;
        }

        public QueryBuilder difficultyList(List<Integer> difficulty){
            this.difficultyList = difficulty;
            return this;
        }

        public QueryBuilder fetchDifficulty(){
            setFetchFields("fetchFields","difficulty");
            return this;
        }

        public QueryBuilder excludeDifficulty(){
            setFetchFields("excludeFields","difficulty");
            return this;
        }

        public QueryBuilder pay_rmbBetWeen(Double pay_rmbSt,Double pay_rmbEd){
            this.pay_rmbSt = pay_rmbSt;
            this.pay_rmbEd = pay_rmbEd;
            return this;
        }

        public QueryBuilder pay_rmbGreaterEqThan(Double pay_rmbSt){
            this.pay_rmbSt = pay_rmbSt;
            return this;
        }
        public QueryBuilder pay_rmbLessEqThan(Double pay_rmbEd){
            this.pay_rmbEd = pay_rmbEd;
            return this;
        }


        public QueryBuilder pay_rmb(Double pay_rmb){
            setPay_rmb(pay_rmb);
            return this;
        }

        public QueryBuilder pay_rmbList(Double ... pay_rmb){
            this.pay_rmbList = solveNullList(pay_rmb);
            return this;
        }

        public QueryBuilder pay_rmbList(List<Double> pay_rmb){
            this.pay_rmbList = pay_rmb;
            return this;
        }

        public QueryBuilder fetchPay_rmb(){
            setFetchFields("fetchFields","pay_rmb");
            return this;
        }

        public QueryBuilder excludePay_rmb(){
            setFetchFields("excludeFields","pay_rmb");
            return this;
        }

        public QueryBuilder pay_coinBetWeen(Double pay_coinSt,Double pay_coinEd){
            this.pay_coinSt = pay_coinSt;
            this.pay_coinEd = pay_coinEd;
            return this;
        }

        public QueryBuilder pay_coinGreaterEqThan(Double pay_coinSt){
            this.pay_coinSt = pay_coinSt;
            return this;
        }
        public QueryBuilder pay_coinLessEqThan(Double pay_coinEd){
            this.pay_coinEd = pay_coinEd;
            return this;
        }


        public QueryBuilder pay_coin(Double pay_coin){
            setPay_coin(pay_coin);
            return this;
        }

        public QueryBuilder pay_coinList(Double ... pay_coin){
            this.pay_coinList = solveNullList(pay_coin);
            return this;
        }

        public QueryBuilder pay_coinList(List<Double> pay_coin){
            this.pay_coinList = pay_coin;
            return this;
        }

        public QueryBuilder fetchPay_coin(){
            setFetchFields("fetchFields","pay_coin");
            return this;
        }

        public QueryBuilder excludePay_coin(){
            setFetchFields("excludeFields","pay_coin");
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

        public PaperModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> subjectList;

        public List<Integer> getSubjectList(){return this.subjectList;}

        private Integer subjectSt;

        private Integer subjectEd;

        public Integer getSubjectSt(){return this.subjectSt;}

        public Integer getSubjectEd(){return this.subjectEd;}

        private List<Integer> levelList;

        public List<Integer> getLevelList(){return this.levelList;}

        private Integer levelSt;

        private Integer levelEd;

        public Integer getLevelSt(){return this.levelSt;}

        public Integer getLevelEd(){return this.levelEd;}

        private List<String> areaList;

        public List<String> getAreaList(){return this.areaList;}


        private List<String> fuzzyArea;

        public List<String> getFuzzyArea(){return this.fuzzyArea;}

        private List<String> rightFuzzyArea;

        public List<String> getRightFuzzyArea(){return this.rightFuzzyArea;}
        private List<String> sourceList;

        public List<String> getSourceList(){return this.sourceList;}


        private List<String> fuzzySource;

        public List<String> getFuzzySource(){return this.fuzzySource;}

        private List<String> rightFuzzySource;

        public List<String> getRightFuzzySource(){return this.rightFuzzySource;}
        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<Double> pay_rmbList;

        public List<Double> getPay_rmbList(){return this.pay_rmbList;}

        private Double pay_rmbSt;

        private Double pay_rmbEd;

        public Double getPay_rmbSt(){return this.pay_rmbSt;}

        public Double getPay_rmbEd(){return this.pay_rmbEd;}

        private List<Double> pay_coinList;

        public List<Double> getPay_coinList(){return this.pay_coinList;}

        private Double pay_coinSt;

        private Double pay_coinEd;

        public Double getPay_coinSt(){return this.pay_coinSt;}

        public Double getPay_coinEd(){return this.pay_coinEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder subjectBetWeen(Integer subjectSt,Integer subjectEd){
            this.subjectSt = subjectSt;
            this.subjectEd = subjectEd;
            return this;
        }

        public ConditionBuilder subjectGreaterEqThan(Integer subjectSt){
            this.subjectSt = subjectSt;
            return this;
        }
        public ConditionBuilder subjectLessEqThan(Integer subjectEd){
            this.subjectEd = subjectEd;
            return this;
        }


        public ConditionBuilder subjectList(Integer ... subject){
            this.subjectList = solveNullList(subject);
            return this;
        }

        public ConditionBuilder subjectList(List<Integer> subject){
            this.subjectList = subject;
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

        public ConditionBuilder fuzzySource (List<String> fuzzySource){
            this.fuzzySource = fuzzySource;
            return this;
        }

        public ConditionBuilder fuzzySource (String ... fuzzySource){
            this.fuzzySource = solveNullList(fuzzySource);
            return this;
        }

        public ConditionBuilder rightFuzzySource (List<String> rightFuzzySource){
            this.rightFuzzySource = rightFuzzySource;
            return this;
        }

        public ConditionBuilder rightFuzzySource (String ... rightFuzzySource){
            this.rightFuzzySource = solveNullList(rightFuzzySource);
            return this;
        }

        public ConditionBuilder sourceList(String ... source){
            this.sourceList = solveNullList(source);
            return this;
        }

        public ConditionBuilder sourceList(List<String> source){
            this.sourceList = source;
            return this;
        }

        public ConditionBuilder difficultyBetWeen(Integer difficultySt,Integer difficultyEd){
            this.difficultySt = difficultySt;
            this.difficultyEd = difficultyEd;
            return this;
        }

        public ConditionBuilder difficultyGreaterEqThan(Integer difficultySt){
            this.difficultySt = difficultySt;
            return this;
        }
        public ConditionBuilder difficultyLessEqThan(Integer difficultyEd){
            this.difficultyEd = difficultyEd;
            return this;
        }


        public ConditionBuilder difficultyList(Integer ... difficulty){
            this.difficultyList = solveNullList(difficulty);
            return this;
        }

        public ConditionBuilder difficultyList(List<Integer> difficulty){
            this.difficultyList = difficulty;
            return this;
        }

        public ConditionBuilder pay_rmbBetWeen(Double pay_rmbSt,Double pay_rmbEd){
            this.pay_rmbSt = pay_rmbSt;
            this.pay_rmbEd = pay_rmbEd;
            return this;
        }

        public ConditionBuilder pay_rmbGreaterEqThan(Double pay_rmbSt){
            this.pay_rmbSt = pay_rmbSt;
            return this;
        }
        public ConditionBuilder pay_rmbLessEqThan(Double pay_rmbEd){
            this.pay_rmbEd = pay_rmbEd;
            return this;
        }


        public ConditionBuilder pay_rmbList(Double ... pay_rmb){
            this.pay_rmbList = solveNullList(pay_rmb);
            return this;
        }

        public ConditionBuilder pay_rmbList(List<Double> pay_rmb){
            this.pay_rmbList = pay_rmb;
            return this;
        }

        public ConditionBuilder pay_coinBetWeen(Double pay_coinSt,Double pay_coinEd){
            this.pay_coinSt = pay_coinSt;
            this.pay_coinEd = pay_coinEd;
            return this;
        }

        public ConditionBuilder pay_coinGreaterEqThan(Double pay_coinSt){
            this.pay_coinSt = pay_coinSt;
            return this;
        }
        public ConditionBuilder pay_coinLessEqThan(Double pay_coinEd){
            this.pay_coinEd = pay_coinEd;
            return this;
        }


        public ConditionBuilder pay_coinList(Double ... pay_coin){
            this.pay_coinList = solveNullList(pay_coin);
            return this;
        }

        public ConditionBuilder pay_coinList(List<Double> pay_coin){
            this.pay_coinList = pay_coin;
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

        private PaperModel obj;

        public Builder(){
            this.obj = new PaperModel();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder subject(Integer subject){
            this.obj.setSubject(subject);
            return this;
        }
        public Builder level(Integer level){
            this.obj.setLevel(level);
            return this;
        }
        public Builder area(String area){
            this.obj.setArea(area);
            return this;
        }
        public Builder source(String source){
            this.obj.setSource(source);
            return this;
        }
        public Builder difficulty(Integer difficulty){
            this.obj.setDifficulty(difficulty);
            return this;
        }
        public Builder pay_rmb(Double pay_rmb){
            this.obj.setPay_rmb(pay_rmb);
            return this;
        }
        public Builder pay_coin(Double pay_coin){
            this.obj.setPay_coin(pay_coin);
            return this;
        }
        public PaperModel build(){return obj;}
    }

}
