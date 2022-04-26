package com.kiarash.vosough;

import Indentation.IndentationStack;
import Indentation.IndentationStackException;
import Indentation.IndentationType;
import com.kiarash.vosough.gen.JythonListener;
import com.kiarash.vosough.gen.JythonParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ProgramPrinter implements JythonListener {

    private final IndentationStack indentationStack = new IndentationStack();

    /**
     * Enter a parse tree produced by {@link JythonParser#start}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterStart(JythonParser.StartContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#start}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitStart(JythonParser.StartContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#program}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterProgram(JythonParser.ProgramContext ctx) {
        String s1 = "program start {";
        System.out.println(s1);
    }

    /**
     * Exit a parse tree produced by {@link JythonParser#program}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitProgram(JythonParser.ProgramContext ctx) {
        String s1 = "}";
        System.out.println(s1);
    }

    /**
     * Enter a parse tree produced by {@link JythonParser#importclass}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterImportclass(JythonParser.ImportclassContext ctx) {

        try {
            this.indentationStack.push(IndentationType.importt);
        } catch (IndentationStackException ignored) {}

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.indentationStack.getIndentation());
        stringBuilder.append("import class: ");
        stringBuilder.append(ctx.importName.getText());
        System.out.println(stringBuilder.toString());
    }

    /**
     * Exit a parse tree produced by {@link JythonParser#importclass}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitImportclass(JythonParser.ImportclassContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#classDef}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterClassDef(JythonParser.ClassDefContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#classDef}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitClassDef(JythonParser.ClassDefContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#class_body}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterClass_body(JythonParser.Class_bodyContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#class_body}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitClass_body(JythonParser.Class_bodyContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#varDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterVarDec(JythonParser.VarDecContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#varDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitVarDec(JythonParser.VarDecContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#arrayDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterArrayDec(JythonParser.ArrayDecContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#arrayDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitArrayDec(JythonParser.ArrayDecContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#methodDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterMethodDec(JythonParser.MethodDecContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#methodDec}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitMethodDec(JythonParser.MethodDecContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#constructor}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterConstructor(JythonParser.ConstructorContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#constructor}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitConstructor(JythonParser.ConstructorContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#parameter}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterParameter(JythonParser.ParameterContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#parameter}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitParameter(JythonParser.ParameterContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#statement}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterStatement(JythonParser.StatementContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#statement}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitStatement(JythonParser.StatementContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#return_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterReturn_statment(JythonParser.Return_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#return_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitReturn_statment(JythonParser.Return_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#condition_list}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterCondition_list(JythonParser.Condition_listContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#condition_list}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitCondition_list(JythonParser.Condition_listContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#condition}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterCondition(JythonParser.ConditionContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#condition}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitCondition(JythonParser.ConditionContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#if_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterIf_statment(JythonParser.If_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#if_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitIf_statment(JythonParser.If_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#while_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterWhile_statment(JythonParser.While_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#while_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitWhile_statment(JythonParser.While_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#if_else_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#if_else_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitIf_else_statment(JythonParser.If_else_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#print_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#print_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitPrint_statment(JythonParser.Print_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#for_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterFor_statment(JythonParser.For_statmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#for_statment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitFor_statment(JythonParser.For_statmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#method_call}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterMethod_call(JythonParser.Method_callContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#method_call}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitMethod_call(JythonParser.Method_callContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#assignment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterAssignment(JythonParser.AssignmentContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#assignment}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitAssignment(JythonParser.AssignmentContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterExp(JythonParser.ExpContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitExp(JythonParser.ExpContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterPrefixexp(JythonParser.PrefixexpContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitPrefixexp(JythonParser.PrefixexpContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#args}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterArgs(JythonParser.ArgsContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#args}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitArgs(JythonParser.ArgsContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#explist}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterExplist(JythonParser.ExplistContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#explist}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitExplist(JythonParser.ExplistContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#arithmetic_operator}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterArithmetic_operator(JythonParser.Arithmetic_operatorContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#arithmetic_operator}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitArithmetic_operator(JythonParser.Arithmetic_operatorContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#relational_operators}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterRelational_operators(JythonParser.Relational_operatorsContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#relational_operators}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitRelational_operators(JythonParser.Relational_operatorsContext ctx) {

    }

    /**
     * Enter a parse tree produced by {@link JythonParser#assignment_operators}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterAssignment_operators(JythonParser.Assignment_operatorsContext ctx) {

    }

    /**
     * Exit a parse tree produced by {@link JythonParser#assignment_operators}.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitAssignment_operators(JythonParser.Assignment_operatorsContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
