package cz.cvut.fit.ostrajava.Compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomaskohout on 11/12/15.
 */
public class Class {

    final String MAGIC_HEADER = "BANIK";

    protected List<String> flags;

    protected String className;
    protected String superName;

    protected List<Field> fields;
    protected List<Method> methods;

    protected ConstantPool constantPool;


    public Class(String className, String superName){
        this.className = className;
        this.superName = superName;

        flags = new ArrayList<String>();
        fields = new ArrayList<Field>();
        methods = new ArrayList<Method>();
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void addMethod(Method method) {
        this.methods.add(method);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public void addFields(Field field) {
        this.fields.add(field);
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public ConstantPool getConstantPool() {
        return constantPool;
    }

    public void setConstantPool(ConstantPool constantPool) {
        this.constantPool = constantPool;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(MAGIC_HEADER + "\n");

        for (String flag : flags){
            sb.append(flag + "|");
        }
        sb.append("\n");

        sb.append(className + ">" + superName);
        sb.append("\n");


        return sb.toString();
    }
}
