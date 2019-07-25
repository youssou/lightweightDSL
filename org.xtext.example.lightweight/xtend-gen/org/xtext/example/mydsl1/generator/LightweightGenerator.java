/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1.generator;

import com.google.common.base.Objects;
import lightweightDSL.App;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.Credential;
import lightweightDSL.LEVEL;
import lightweightDSL.Login;
import lightweightDSL.PROVIDER;
import lightweightDSL.Phase;
import lightweightDSL.Provider;
import lightweightDSL.Registration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LightweightGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final App app = ((App) _head);
    this.assignAuthenticator(app);
    this.assignMethod(app);
  }
  
  public void assignAuthenticator(final App app) {
    EList<Authenticator> _authenticators = app.getAuthenticators();
    for (final Authenticator auth : _authenticators) {
    }
  }
  
  public void assignMethod(final App app) {
    EList<Phase> _phases = app.getPhases();
    for (final Phase phase : _phases) {
      String _name = phase.getClass().getName();
      if (_name != null) {
        switch (_name) {
          case "Registration":
            final Registration r = ((Registration) phase);
            EList<Credential> _credentials = r.getCredentials();
            for (final Credential credential : _credentials) {
              if (((credential.getVerifmethod().isUniqueness() && 
                credential.getVerifmethod().isValidity()) && 
                credential.getVerifmethod().isBindings())) {
                phase.setLevel(LEVEL.LOW);
                InputOutput.<String>println("Risk level for fraudulent enrollment is LOW or Inexistant all requirements are satisfied");
              } else {
                if ((((!credential.getVerifmethod().isUniqueness()) || 
                  (!credential.getVerifmethod().isValidity())) || 
                  (!credential.getVerifmethod().isBindings()))) {
                  phase.setLevel(LEVEL.MEDIUM);
                  InputOutput.<String>println("Risk level for fraudulent enrollment is MEDIUM because on the property are not ensured");
                } else {
                  PROVIDER _provider = credential.getProvider();
                  boolean _equals = Objects.equal(_provider, Provider.ID_P);
                  if (_equals) {
                    phase.setLevel(LEVEL.MEDIUM);
                    InputOutput.<String>println("Risk level for fraudulent enrollment is MEDIUM since the IdP may be voiolated");
                  } else {
                    phase.setLevel(LEVEL.HIGH);
                    InputOutput.<String>println("Risk level for fraudulent enrollment is HIGH because of absence of verification method");
                  }
                }
              }
            }
            break;
          case "Login":
            final Login l = ((Login) phase);
            EList<AuthMethod> _authMethods = l.getAuthMethods();
            for (final AuthMethod auth : _authMethods) {
            }
            break;
          case "Reset":
            break;
          case "Recovery":
            break;
        }
      }
    }
  }
}
