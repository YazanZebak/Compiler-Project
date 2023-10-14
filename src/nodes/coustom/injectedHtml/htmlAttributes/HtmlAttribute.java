package nodes.coustom.injectedHtml.htmlAttributes;

import AST.ASTVisitor;
import nodes.Node;
import nodes.coustom.injectedHtml.htmlAttributes.cp_app.CpApp;
import nodes.coustom.injectedHtml.htmlAttributes.cp_click.CpClick;
import nodes.coustom.injectedHtml.htmlAttributes.cp_for.CpFor;
import nodes.coustom.injectedHtml.htmlAttributes.cp_hide.CpHide;
import nodes.coustom.injectedHtml.htmlAttributes.cp_if.CpIf;
import nodes.coustom.injectedHtml.htmlAttributes.cp_model.CpModel;
import nodes.coustom.injectedHtml.htmlAttributes.cp_mouseover.CpMouseOver;
import nodes.coustom.injectedHtml.htmlAttributes.cp_show.CpShow;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch.CpSwitch;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch_case.CpSwitchCase;
import nodes.coustom.injectedHtml.htmlAttributes.cp_switch_default.CpSwitchDefault;
import nodes.coustom.injectedHtml.htmlAttributes.cp_type.CpType;
import nodes.coustom.injectedHtml.htmlAttributes.default_cp.DefaultCp;
import nodes.coustom.injectedHtml.prettyPrinter.PrettyPrinter;

import java.util.HashMap;
import java.util.Map;

public class HtmlAttribute extends Node {

    CpShow cpShow;
    CpApp cpApp;
    CpFor cpFor;
    CpIf cpIf;
    CpHide cpHide;
    CpSwitch cpSwitch;
    CpSwitchCase cpSwitchCase;
    CpSwitchDefault cpSwitchDefault;
    CpModel cpModel;
    CpType cpType;
    CpClick cpClick;
    CpMouseOver cpMouseOver;
    DefaultCp defaultCp;

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (cpShow != null)
            cpShow.accept(astVisitor);
        if (cpApp != null)
            cpApp.accept(astVisitor);
        if (cpFor != null)
            cpFor.accept(astVisitor);
        if (cpIf != null)
            cpIf.accept(astVisitor);
        if (cpHide != null)
            cpHide.accept(astVisitor);
        if (cpSwitch != null)
            cpSwitch.accept(astVisitor);
        if (cpSwitchCase != null)
            cpSwitchCase.accept(astVisitor);
        if (cpModel != null)
            cpModel.accept(astVisitor);
        if (cpSwitchDefault != null)
            cpSwitchDefault.accept(astVisitor);
        if (cpType != null)
            cpType.accept(astVisitor);
        if (cpClick != null)
            cpClick.accept(astVisitor);
        if (cpMouseOver != null)
            cpMouseOver.accept(astVisitor);
        if (defaultCp != null)
            defaultCp.accept(astVisitor);
    }

    public CpShow getCpShow() {
        return cpShow;
    }

    public void setCpShow(CpShow cpShow) {
        this.cpShow = cpShow;
    }

    public CpApp getCpApp() {
        return cpApp;
    }

    public void setCpApp(CpApp cpApp) {
        this.cpApp = cpApp;
    }

    public CpFor getCpFor() {
        return cpFor;
    }

    public void setCpFor(CpFor cpFor) {
        this.cpFor = cpFor;
    }

    public CpIf getCpIf() {
        return cpIf;
    }

    public void setCpIf(CpIf cpIf) {
        this.cpIf = cpIf;
    }

    public CpHide getCpHide() {
        return cpHide;
    }

    public void setCpHide(CpHide cpHide) {
        this.cpHide = cpHide;
    }

    public CpSwitch getCpSwitch() {
        return cpSwitch;
    }

    public void setCpSwitch(CpSwitch cpSwitch) {
        this.cpSwitch = cpSwitch;
    }

    public CpSwitchCase getCpSwitchCase() {
        return cpSwitchCase;
    }

    public void setCpSwitchCase(CpSwitchCase cpSwitchCase) {
        this.cpSwitchCase = cpSwitchCase;
    }

    public CpSwitchDefault getCpSwitchDefault() {
        return cpSwitchDefault;
    }

    public void setCpSwitchDefault(CpSwitchDefault cpSwitchDefault) {
        this.cpSwitchDefault = cpSwitchDefault;
    }

    public CpModel getCpModel() {
        return cpModel;
    }

    public void setCpModel(CpModel cpModel) {
        this.cpModel = cpModel;
    }

    public CpType getCpType() {
        return cpType;
    }

    public void setCpType(CpType cpType) {
        this.cpType = cpType;
    }

    public CpClick getCpClick() {
        return cpClick;
    }

    public void setCpClick(CpClick cpClick) {
        this.cpClick = cpClick;
    }

    public CpMouseOver getCpMouseOver() {
        return cpMouseOver;
    }

    public void setCpMouseOver(CpMouseOver cpMouseOver) {
        this.cpMouseOver = cpMouseOver;
    }

    public DefaultCp getDefaultCp() {
        return defaultCp;
    }

    public void setDefaultCp(DefaultCp defaultCp) {
        this.defaultCp = defaultCp;
    }

    public String toString(int numberOfSpaces) {
        Map<String, String> objects = new HashMap<String, String>();
        String result = "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces);
        ;
        if (cpApp != null) {
            objects.put("cpApp", cpApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpShow != null) {
            objects.put("cpShow", cpShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpFor != null) {
            objects.put("cpFor", cpFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpHide != null) {
            objects.put("cpHide", cpHide.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpIf != null) {
            objects.put("cpIf", cpIf.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpSwitch != null) {
            objects.put("cpSwitch", cpSwitch.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpSwitchCase != null) {
            objects.put("cpSwitchCase", cpSwitchCase.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpSwitchDefault != null) {
            objects.put("cpSwitchDefault", cpSwitchDefault.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpModel != null) {
            objects.put("cpModel", cpModel.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpType != null) {
            objects.put("cpType", cpType.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpClick != null) {
            objects.put("cpClick", cpClick.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if (cpMouseOver != null) {
            objects.put("cpMouseOver", cpMouseOver.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        if(defaultCp != null){
            objects.put("defaultCp", defaultCp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces));
        }
        for (Map.Entry<String, String> object : objects.entrySet()) {
            result += object.getValue();
        }
        result += '}';


       /* if (cpShow != null) {
            if (cpApp != null) {
                if (cpFor != null) {
                    return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            cpShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            cpFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            cpApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            '}';
                }
                return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        cpShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        cpApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            }
            return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    cpShow.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                    '}';
        } else {
            if (cpApp != null) {
                if (cpFor != null) {
                    return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            cpFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            cpApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                            '}';
                }
                return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        cpApp.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';

            }
            if (cpFor != null) {
                return "HtmlAttribute: {" + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        cpFor.toString(numberOfSpaces + 1) + "\n" + PrettyPrinter.addSpaces(numberOfSpaces) +
                        '}';
            } else {
                return "HtmlAttribute: { }";
            }
        }*/

        return result;
    }
}
