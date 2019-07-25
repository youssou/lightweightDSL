/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import lightweightDSL.App;
import lightweightDSL.AuthMethod;
import lightweightDSL.Authenticator;
import lightweightDSL.Credential;
import lightweightDSL.Phase;
import lightweightDSL.Registration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl1.services.LightweightGrammarAccess;

@SuppressWarnings("all")
public class LightweightFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private LightweightGrammarAccess _lightweightGrammarAccess;
  
  protected void _format(final App app, @Extension final IFormattableDocument document) {
    EList<Authenticator> _authenticators = app.getAuthenticators();
    for (final Authenticator authenticator : _authenticators) {
      document.<Authenticator>format(authenticator);
    }
    EList<AuthMethod> _authMethods = app.getAuthMethods();
    for (final AuthMethod authMethod : _authMethods) {
      document.<AuthMethod>format(authMethod);
    }
    EList<Phase> _phases = app.getPhases();
    for (final Phase phase : _phases) {
      document.<Phase>format(phase);
    }
  }
  
  protected void _format(final Registration registration, @Extension final IFormattableDocument document) {
    EList<Credential> _credentials = registration.getCredentials();
    for (final Credential credential : _credentials) {
      document.<Credential>format(credential);
    }
  }
  
  public void format(final Object registration, final IFormattableDocument document) {
    if (registration instanceof XtextResource) {
      _format((XtextResource)registration, document);
      return;
    } else if (registration instanceof Registration) {
      _format((Registration)registration, document);
      return;
    } else if (registration instanceof App) {
      _format((App)registration, document);
      return;
    } else if (registration instanceof EObject) {
      _format((EObject)registration, document);
      return;
    } else if (registration == null) {
      _format((Void)null, document);
      return;
    } else if (registration != null) {
      _format(registration, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(registration, document).toString());
    }
  }
}