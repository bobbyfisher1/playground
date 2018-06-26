/**
 * generated by Xtext 2.13.0
 */
package org.example.eis.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.example.eis.eis.EisModel;
import org.example.eis.tests.EisInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EisInjectorProvider.class)
@SuppressWarnings("all")
public class EisParsingTest {
  @Inject
  @Extension
  private ParseHelper<EisModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testFixedProgramBeginning_noErrors() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"abckdjh\";");
      _builder.newLine();
      _builder.append("plcname = \"d383\";");
      _builder.newLine();
      _builder.append("author \t= \"name two\";");
      _builder.newLine();
      _builder.append("testcase Blockname{\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testActive = false;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("blockType = FC;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description = \"\";");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("define");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("teststep");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAccessingProgrammBeginning_noErrors() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("project = \"x\";");
      _builder.newLine();
      _builder.append("plcname = \"fj484\";");
      _builder.newLine();
      _builder.append("author = \"Paul Auster\";");
      _builder.newLine();
      EisModel _parse = this._parseHelper.parse(_builder);
      final Procedure1<EisModel> _function = (EisModel it) -> {
        Assert.assertEquals(it.getProject_name(), "x");
        Assert.assertEquals(it.getPlc_name(), "fj484");
        Assert.assertEquals(it.getAuthor_name(), "Paul Auster");
      };
      ObjectExtensions.<EisModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
