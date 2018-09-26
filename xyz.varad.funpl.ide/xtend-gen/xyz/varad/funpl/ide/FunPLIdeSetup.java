/**
 * generated by Xtext 2.15.0
 */
package xyz.varad.funpl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import xyz.varad.funpl.FunPLRuntimeModule;
import xyz.varad.funpl.FunPLStandaloneSetup;
import xyz.varad.funpl.ide.FunPLIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FunPLIdeSetup extends FunPLStandaloneSetup {
  @Override
  public Injector createInjector() {
    FunPLRuntimeModule _funPLRuntimeModule = new FunPLRuntimeModule();
    FunPLIdeModule _funPLIdeModule = new FunPLIdeModule();
    return Guice.createInjector(Modules2.mixin(_funPLRuntimeModule, _funPLIdeModule));
  }
}
