/*
 * generated by Xtext 2.25.0
 */
package ups.m2dl.tpnote.serializer;

import com.google.inject.Inject;
import java.util.Set;
import maisonDeDisque.Album;
import maisonDeDisque.Chanson;
import maisonDeDisque.MaisonDeDisque;
import maisonDeDisque.MaisonDeDisquePackage;
import maisonDeDisque.Personne;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ups.m2dl.tpnote.services.MaisonDeDisqueGrammarAccess;

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
		if (epackage == MaisonDeDisquePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MaisonDeDisquePackage.ALBUM:
				sequence_Album(context, (Album) semanticObject); 
				return; 
			case MaisonDeDisquePackage.CHANSON:
				sequence_Chanson(context, (Chanson) semanticObject); 
				return; 
			case MaisonDeDisquePackage.MAISON_DE_DISQUE:
				sequence_MaisonDeDisque(context, (MaisonDeDisque) semanticObject); 
				return; 
			case MaisonDeDisquePackage.PERSONNE:
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
	 *     (name=EString anneeSortie=EString? type=AlbumType? chansons+=[Chanson|EString] chansons+=[Chanson|EString]*)
	 */
	protected void sequence_Album(ISerializationContext context, Album semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Chanson returns Chanson
	 *
	 * Constraint:
	 *     (name=EString auteurs+=[Personne|EString] auteurs+=[Personne|EString]* chanteurs+=[Personne|EString] chanteurs+=[Personne|EString]*)
	 */
	protected void sequence_Chanson(ISerializationContext context, Chanson semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MaisonDeDisque returns MaisonDeDisque
	 *
	 * Constraint:
	 *     (
	 *         chansons+=Chanson 
	 *         chansons+=Chanson* 
	 *         albums+=Album 
	 *         albums+=Album* 
	 *         personnes+=Personne 
	 *         personnes+=Personne*
	 *     )
	 */
	protected void sequence_MaisonDeDisque(ISerializationContext context, MaisonDeDisque semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Personne returns Personne
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Personne(ISerializationContext context, Personne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MaisonDeDisquePackage.Literals.PERSONNE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MaisonDeDisquePackage.Literals.PERSONNE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPersonneAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
