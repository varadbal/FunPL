/*
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import xyz.varad.funpl.FunPLRuntimeModule
import xyz.varad.funpl.FunPLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FunPLIdeSetup extends FunPLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FunPLRuntimeModule, new FunPLIdeModule))
	}
	
}
