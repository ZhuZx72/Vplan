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
public class ExerciseModel implements Serializable {

    private static final long serialVersionUID = 1562150113984L;


    /**
    * 主键
    * 题目暂时是以试卷形式展现
    * isNullAble:0
    */
    private Integer id;

    /**
    * 材料（可有可无）
    * isNullAble:1
    */
    private String material;

    /**
    * 问题
    * isNullAble:1
    */
    private String question;

    /**
    * 答案
    * isNullAble:1
    */
    private String answer;

    /**
    * 类型（暂定） 1：单选题2：多选题3：填空题4：综合题5：作文题
    * isNullAble:1
    */
    private Integer type;

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
    * 难度1：简单2：中等3：困难
    * isNullAble:1
    */
    private Integer difficulty;

    /**
    * 试卷id
    * isNullAble:1
    */
    private Integer paper_id;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setMaterial(String material){this.material = material;}

    public String getMaterial(){return this.material;}

    public void setQuestion(String question){this.question = question;}

    public String getQuestion(){return this.question;}

    public void setAnswer(String answer){this.answer = answer;}

    public String getAnswer(){return this.answer;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setSubject(Integer subject){this.subject = subject;}

    public Integer getSubject(){return this.subject;}

    public void setLevel(Integer level){this.level = level;}

    public Integer getLevel(){return this.level;}

    public void setDifficulty(Integer difficulty){this.difficulty = difficulty;}

    public Integer getDifficulty(){return this.difficulty;}

    public void setPaper_id(Integer paper_id){this.paper_id = paper_id;}

    public Integer getPaper_id(){return this.paper_id;}
    @Override
    public String toString() {
        return "ExerciseModel{" +
                "id='" + id + '\'' +
                "material='" + material + '\'' +
                "question='" + question + '\'' +
                "answer='" + answer + '\'' +
                "type='" + type + '\'' +
                "subject='" + subject + '\'' +
                "level='" + level + '\'' +
                "difficulty='" + difficulty + '\'' +
                "paper_id='" + paper_id + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ExerciseModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(ExerciseModel set){
            this.set = set;
            return this;
        }

        public ExerciseModel getSet(){
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

    public static class QueryBuilder extends ExerciseModel{
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

        private List<String> materialList;

        public List<String> getMaterialList(){return this.materialList;}


        private List<String> fuzzyMaterial;

        public List<String> getFuzzyMaterial(){return this.fuzzyMaterial;}

        private List<String> rightFuzzyMaterial;

        public List<String> getRightFuzzyMaterial(){return this.rightFuzzyMaterial;}
        private List<String> questionList;

        public List<String> getQuestionList(){return this.questionList;}


        private List<String> fuzzyQuestion;

        public List<String> getFuzzyQuestion(){return this.fuzzyQuestion;}

        private List<String> rightFuzzyQuestion;

        public List<String> getRightFuzzyQuestion(){return this.rightFuzzyQuestion;}
        private List<String> answerList;

        public List<String> getAnswerList(){return this.answerList;}


        private List<String> fuzzyAnswer;

        public List<String> getFuzzyAnswer(){return this.fuzzyAnswer;}

        private List<String> rightFuzzyAnswer;

        public List<String> getRightFuzzyAnswer(){return this.rightFuzzyAnswer;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

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

        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<Integer> paper_idList;

        public List<Integer> getPaper_idList(){return this.paper_idList;}

        private Integer paper_idSt;

        private Integer paper_idEd;

        public Integer getPaper_idSt(){return this.paper_idSt;}

        public Integer getPaper_idEd(){return this.paper_idEd;}

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

        public QueryBuilder fuzzyMaterial (List<String> fuzzyMaterial){
            this.fuzzyMaterial = fuzzyMaterial;
            return this;
        }

        public QueryBuilder fuzzyMaterial (String ... fuzzyMaterial){
            this.fuzzyMaterial = solveNullList(fuzzyMaterial);
            return this;
        }

        public QueryBuilder rightFuzzyMaterial (List<String> rightFuzzyMaterial){
            this.rightFuzzyMaterial = rightFuzzyMaterial;
            return this;
        }

        public QueryBuilder rightFuzzyMaterial (String ... rightFuzzyMaterial){
            this.rightFuzzyMaterial = solveNullList(rightFuzzyMaterial);
            return this;
        }

        public QueryBuilder material(String material){
            setMaterial(material);
            return this;
        }

        public QueryBuilder materialList(String ... material){
            this.materialList = solveNullList(material);
            return this;
        }

        public QueryBuilder materialList(List<String> material){
            this.materialList = material;
            return this;
        }

        public QueryBuilder fetchMaterial(){
            setFetchFields("fetchFields","material");
            return this;
        }

        public QueryBuilder excludeMaterial(){
            setFetchFields("excludeFields","material");
            return this;
        }

        public QueryBuilder fuzzyQuestion (List<String> fuzzyQuestion){
            this.fuzzyQuestion = fuzzyQuestion;
            return this;
        }

        public QueryBuilder fuzzyQuestion (String ... fuzzyQuestion){
            this.fuzzyQuestion = solveNullList(fuzzyQuestion);
            return this;
        }

        public QueryBuilder rightFuzzyQuestion (List<String> rightFuzzyQuestion){
            this.rightFuzzyQuestion = rightFuzzyQuestion;
            return this;
        }

        public QueryBuilder rightFuzzyQuestion (String ... rightFuzzyQuestion){
            this.rightFuzzyQuestion = solveNullList(rightFuzzyQuestion);
            return this;
        }

        public QueryBuilder question(String question){
            setQuestion(question);
            return this;
        }

        public QueryBuilder questionList(String ... question){
            this.questionList = solveNullList(question);
            return this;
        }

        public QueryBuilder questionList(List<String> question){
            this.questionList = question;
            return this;
        }

        public QueryBuilder fetchQuestion(){
            setFetchFields("fetchFields","question");
            return this;
        }

        public QueryBuilder excludeQuestion(){
            setFetchFields("excludeFields","question");
            return this;
        }

        public QueryBuilder fuzzyAnswer (List<String> fuzzyAnswer){
            this.fuzzyAnswer = fuzzyAnswer;
            return this;
        }

        public QueryBuilder fuzzyAnswer (String ... fuzzyAnswer){
            this.fuzzyAnswer = solveNullList(fuzzyAnswer);
            return this;
        }

        public QueryBuilder rightFuzzyAnswer (List<String> rightFuzzyAnswer){
            this.rightFuzzyAnswer = rightFuzzyAnswer;
            return this;
        }

        public QueryBuilder rightFuzzyAnswer (String ... rightFuzzyAnswer){
            this.rightFuzzyAnswer = solveNullList(rightFuzzyAnswer);
            return this;
        }

        public QueryBuilder answer(String answer){
            setAnswer(answer);
            return this;
        }

        public QueryBuilder answerList(String ... answer){
            this.answerList = solveNullList(answer);
            return this;
        }

        public QueryBuilder answerList(List<String> answer){
            this.answerList = answer;
            return this;
        }

        public QueryBuilder fetchAnswer(){
            setFetchFields("fetchFields","answer");
            return this;
        }

        public QueryBuilder excludeAnswer(){
            setFetchFields("excludeFields","answer");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
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

        public QueryBuilder paper_idBetWeen(Integer paper_idSt,Integer paper_idEd){
            this.paper_idSt = paper_idSt;
            this.paper_idEd = paper_idEd;
            return this;
        }

        public QueryBuilder paper_idGreaterEqThan(Integer paper_idSt){
            this.paper_idSt = paper_idSt;
            return this;
        }
        public QueryBuilder paper_idLessEqThan(Integer paper_idEd){
            this.paper_idEd = paper_idEd;
            return this;
        }


        public QueryBuilder paper_id(Integer paper_id){
            setPaper_id(paper_id);
            return this;
        }

        public QueryBuilder paper_idList(Integer ... paper_id){
            this.paper_idList = solveNullList(paper_id);
            return this;
        }

        public QueryBuilder paper_idList(List<Integer> paper_id){
            this.paper_idList = paper_id;
            return this;
        }

        public QueryBuilder fetchPaper_id(){
            setFetchFields("fetchFields","paper_id");
            return this;
        }

        public QueryBuilder excludePaper_id(){
            setFetchFields("excludeFields","paper_id");
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

        public ExerciseModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> materialList;

        public List<String> getMaterialList(){return this.materialList;}


        private List<String> fuzzyMaterial;

        public List<String> getFuzzyMaterial(){return this.fuzzyMaterial;}

        private List<String> rightFuzzyMaterial;

        public List<String> getRightFuzzyMaterial(){return this.rightFuzzyMaterial;}
        private List<String> questionList;

        public List<String> getQuestionList(){return this.questionList;}


        private List<String> fuzzyQuestion;

        public List<String> getFuzzyQuestion(){return this.fuzzyQuestion;}

        private List<String> rightFuzzyQuestion;

        public List<String> getRightFuzzyQuestion(){return this.rightFuzzyQuestion;}
        private List<String> answerList;

        public List<String> getAnswerList(){return this.answerList;}


        private List<String> fuzzyAnswer;

        public List<String> getFuzzyAnswer(){return this.fuzzyAnswer;}

        private List<String> rightFuzzyAnswer;

        public List<String> getRightFuzzyAnswer(){return this.rightFuzzyAnswer;}
        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

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

        private List<Integer> difficultyList;

        public List<Integer> getDifficultyList(){return this.difficultyList;}

        private Integer difficultySt;

        private Integer difficultyEd;

        public Integer getDifficultySt(){return this.difficultySt;}

        public Integer getDifficultyEd(){return this.difficultyEd;}

        private List<Integer> paper_idList;

        public List<Integer> getPaper_idList(){return this.paper_idList;}

        private Integer paper_idSt;

        private Integer paper_idEd;

        public Integer getPaper_idSt(){return this.paper_idSt;}

        public Integer getPaper_idEd(){return this.paper_idEd;}


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

        public ConditionBuilder fuzzyMaterial (List<String> fuzzyMaterial){
            this.fuzzyMaterial = fuzzyMaterial;
            return this;
        }

        public ConditionBuilder fuzzyMaterial (String ... fuzzyMaterial){
            this.fuzzyMaterial = solveNullList(fuzzyMaterial);
            return this;
        }

        public ConditionBuilder rightFuzzyMaterial (List<String> rightFuzzyMaterial){
            this.rightFuzzyMaterial = rightFuzzyMaterial;
            return this;
        }

        public ConditionBuilder rightFuzzyMaterial (String ... rightFuzzyMaterial){
            this.rightFuzzyMaterial = solveNullList(rightFuzzyMaterial);
            return this;
        }

        public ConditionBuilder materialList(String ... material){
            this.materialList = solveNullList(material);
            return this;
        }

        public ConditionBuilder materialList(List<String> material){
            this.materialList = material;
            return this;
        }

        public ConditionBuilder fuzzyQuestion (List<String> fuzzyQuestion){
            this.fuzzyQuestion = fuzzyQuestion;
            return this;
        }

        public ConditionBuilder fuzzyQuestion (String ... fuzzyQuestion){
            this.fuzzyQuestion = solveNullList(fuzzyQuestion);
            return this;
        }

        public ConditionBuilder rightFuzzyQuestion (List<String> rightFuzzyQuestion){
            this.rightFuzzyQuestion = rightFuzzyQuestion;
            return this;
        }

        public ConditionBuilder rightFuzzyQuestion (String ... rightFuzzyQuestion){
            this.rightFuzzyQuestion = solveNullList(rightFuzzyQuestion);
            return this;
        }

        public ConditionBuilder questionList(String ... question){
            this.questionList = solveNullList(question);
            return this;
        }

        public ConditionBuilder questionList(List<String> question){
            this.questionList = question;
            return this;
        }

        public ConditionBuilder fuzzyAnswer (List<String> fuzzyAnswer){
            this.fuzzyAnswer = fuzzyAnswer;
            return this;
        }

        public ConditionBuilder fuzzyAnswer (String ... fuzzyAnswer){
            this.fuzzyAnswer = solveNullList(fuzzyAnswer);
            return this;
        }

        public ConditionBuilder rightFuzzyAnswer (List<String> rightFuzzyAnswer){
            this.rightFuzzyAnswer = rightFuzzyAnswer;
            return this;
        }

        public ConditionBuilder rightFuzzyAnswer (String ... rightFuzzyAnswer){
            this.rightFuzzyAnswer = solveNullList(rightFuzzyAnswer);
            return this;
        }

        public ConditionBuilder answerList(String ... answer){
            this.answerList = solveNullList(answer);
            return this;
        }

        public ConditionBuilder answerList(List<String> answer){
            this.answerList = answer;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
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

        public ConditionBuilder paper_idBetWeen(Integer paper_idSt,Integer paper_idEd){
            this.paper_idSt = paper_idSt;
            this.paper_idEd = paper_idEd;
            return this;
        }

        public ConditionBuilder paper_idGreaterEqThan(Integer paper_idSt){
            this.paper_idSt = paper_idSt;
            return this;
        }
        public ConditionBuilder paper_idLessEqThan(Integer paper_idEd){
            this.paper_idEd = paper_idEd;
            return this;
        }


        public ConditionBuilder paper_idList(Integer ... paper_id){
            this.paper_idList = solveNullList(paper_id);
            return this;
        }

        public ConditionBuilder paper_idList(List<Integer> paper_id){
            this.paper_idList = paper_id;
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

        private ExerciseModel obj;

        public Builder(){
            this.obj = new ExerciseModel();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder material(String material){
            this.obj.setMaterial(material);
            return this;
        }
        public Builder question(String question){
            this.obj.setQuestion(question);
            return this;
        }
        public Builder answer(String answer){
            this.obj.setAnswer(answer);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
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
        public Builder difficulty(Integer difficulty){
            this.obj.setDifficulty(difficulty);
            return this;
        }
        public Builder paper_id(Integer paper_id){
            this.obj.setPaper_id(paper_id);
            return this;
        }
        public ExerciseModel build(){return obj;}
    }

}
