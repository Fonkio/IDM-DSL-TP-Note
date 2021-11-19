/*
 * generated by Xtext 2.25.0
 */
package ups.m2dl.tpNote.serializer;

import albums.Album;
import albums.AlbumsPackage;
import albums.Chanson;
import albums.MaisonDeDisques;
import albums.Personne;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import ups.m2dl.tpNote.services.MaisonDeDisqueGrammarAccess;

@SuppressWarnings("all")
public class MaisonDeDisqueSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MaisonDeDisqueGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AlbumsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AlbumsPackage.ALBUM:
				sequence_Album(context, (Album) semanticObject); 
				return; 
			case AlbumsPackage.CHANSON:
				sequence_Chanson(context, (Chanson) semanticObject); 
				return; 
			case AlbumsPackage.MAISON_DE_DISQUES:
				sequence_MaisonDeDisques(context, (MaisonDeDisques) semanticObject); 
				return; 
			case AlbumsPackage.PERSONNE:
				sequence_Personne(context, (Personne) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Album returns Album
	 *
	 * Constraint:
	 *     (
	 *         anneeSortie=EDate? 
	 *         type=AlbumsType? 
	 *         nom=EString? 
	 *         id=EString? 
	 *         chansons+=[Chanson|EString] 
	 *         chansons+=[Chanson|EString]*
	 *     )
	 */
	protected void sequence_Album(ISerializationContext context, Album semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Chanson returns Chanson
	 *
	 * Constraint:
	 *     (
	 *         id=EString? 
	 *         titre=EString? 
	 *         chanteurs+=[Personne|EString] 
	 *         chanteurs+=[Personne|EString]* 
	 *         auteur+=[Personne|EString] 
	 *         auteur+=[Personne|EString]*
	 *     )
	 */
	protected void sequence_Chanson(ISerializationContext context, Chanson semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MaisonDeDisques returns MaisonDeDisques
	 *
	 * Constraint:
	 *     (
	 *         albums+=Album 
	 *         albums+=Album* 
	 *         chansons+=Chanson 
	 *         chansons+=Chanson* 
	 *         personnes+=Personne 
	 *         personnes+=Personne*
	 *     )
	 */
	protected void sequence_MaisonDeDisques(ISerializationContext context, MaisonDeDisques semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Personne returns Personne
	 *
	 * Constraint:
	 *     (
	 *         nom=EString? 
	 *         (chansonsChanteur+=[Chanson|EString] chansonsChanteur+=[Chanson|EString]*)? 
	 *         (chansonsAuteur+=[Chanson|EString] chansonsAuteur+=[Chanson|EString]*)?
	 *     )
	 */
	protected void sequence_Personne(ISerializationContext context, Personne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
