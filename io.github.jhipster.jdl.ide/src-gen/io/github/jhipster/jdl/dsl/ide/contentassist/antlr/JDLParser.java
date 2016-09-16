/*
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import io.github.jhipster.jdl.dsl.ide.contentassist.antlr.internal.InternalJDLParser;
import io.github.jhipster.jdl.dsl.services.JDLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class JDLParser extends AbstractContentAssistParser {

	@Inject
	private JDLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalJDLParser createParser() {
		InternalJDLParser result = new InternalJDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementsAccess().getAlternatives(), "rule__Elements__Alternatives");
					put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
					put(grammarAccess.getNumericFieldAccess().getAlternatives(), "rule__NumericField__Alternatives");
					put(grammarAccess.getDateFieldAccess().getAlternatives(), "rule__DateField__Alternatives");
					put(grammarAccess.getBinaryLargeObjectFieldAccess().getAlternatives(), "rule__BinaryLargeObjectField__Alternatives");
					put(grammarAccess.getGenerationSettingAccess().getAlternatives(), "rule__GenerationSetting__Alternatives");
					put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
					put(grammarAccess.getServiceTypeAccess().getAlternatives(), "rule__ServiceType__Alternatives");
					put(grammarAccess.getPaginateTypeAccess().getAlternatives(), "rule__PaginateType__Alternatives");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getEnumFieldAccess().getGroup(), "rule__EnumField__Group__0");
					put(grammarAccess.getStringFieldAccess().getGroup(), "rule__StringField__Group__0");
					put(grammarAccess.getIntegerFieldAccess().getGroup(), "rule__IntegerField__Group__0");
					put(grammarAccess.getLongFieldAccess().getGroup(), "rule__LongField__Group__0");
					put(grammarAccess.getBigDecimalFieldAccess().getGroup(), "rule__BigDecimalField__Group__0");
					put(grammarAccess.getFloatFieldAccess().getGroup(), "rule__FloatField__Group__0");
					put(grammarAccess.getDoubleFieldAccess().getGroup(), "rule__DoubleField__Group__0");
					put(grammarAccess.getBooleanFieldAccess().getGroup(), "rule__BooleanField__Group__0");
					put(grammarAccess.getLocalDateFieldAccess().getGroup(), "rule__LocalDateField__Group__0");
					put(grammarAccess.getZonedDateTimeFieldAccess().getGroup(), "rule__ZonedDateTimeField__Group__0");
					put(grammarAccess.getBlobFieldAccess().getGroup(), "rule__BlobField__Group__0");
					put(grammarAccess.getAnyBlobFieldAccess().getGroup(), "rule__AnyBlobField__Group__0");
					put(grammarAccess.getImageBlobFieldAccess().getGroup(), "rule__ImageBlobField__Group__0");
					put(grammarAccess.getMinLengthValidatorAccess().getGroup(), "rule__MinLengthValidator__Group__0");
					put(grammarAccess.getMaxLengthValidatorAccess().getGroup(), "rule__MaxLengthValidator__Group__0");
					put(grammarAccess.getPatternValidatorAccess().getGroup(), "rule__PatternValidator__Group__0");
					put(grammarAccess.getMinValidatorAccess().getGroup(), "rule__MinValidator__Group__0");
					put(grammarAccess.getMaxValidatorAccess().getGroup(), "rule__MaxValidator__Group__0");
					put(grammarAccess.getMinBytesValidatorAccess().getGroup(), "rule__MinBytesValidator__Group__0");
					put(grammarAccess.getMaxBytesValidatorAccess().getGroup(), "rule__MaxBytesValidator__Group__0");
					put(grammarAccess.getStringValidatorsAccess().getGroup(), "rule__StringValidators__Group__0");
					put(grammarAccess.getNumericValidatorsAccess().getGroup(), "rule__NumericValidators__Group__0");
					put(grammarAccess.getBlobValidatorsAccess().getGroup(), "rule__BlobValidators__Group__0");
					put(grammarAccess.getRelationshipsAccess().getGroup(), "rule__Relationships__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getRelationshipNameAccess().getGroup(), "rule__RelationshipName__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup(), "rule__EnumType__Group__0");
					put(grammarAccess.getEnumTypeAccess().getGroup_4(), "rule__EnumType__Group_4__0");
					put(grammarAccess.getServiceGenerationSettingAccess().getGroup(), "rule__ServiceGenerationSetting__Group__0");
					put(grammarAccess.getServiceGenerationSettingAccess().getGroup_2(), "rule__ServiceGenerationSetting__Group_2__0");
					put(grammarAccess.getDTOGenerationSettingAccess().getGroup(), "rule__DTOGenerationSetting__Group__0");
					put(grammarAccess.getDTOGenerationSettingAccess().getGroup_2(), "rule__DTOGenerationSetting__Group_2__0");
					put(grammarAccess.getPaginateGenerationSettingAccess().getGroup(), "rule__PaginateGenerationSetting__Group__0");
					put(grammarAccess.getPaginateGenerationSettingAccess().getGroup_2(), "rule__PaginateGenerationSetting__Group_2__0");
					put(grammarAccess.getAngularSuffixGenerationSettingAccess().getGroup(), "rule__AngularSuffixGenerationSetting__Group__0");
					put(grammarAccess.getAngularSuffixGenerationSettingAccess().getGroup_2(), "rule__AngularSuffixGenerationSetting__Group_2__0");
					put(grammarAccess.getDomainModelAccess().getElementsAssignment(), "rule__DomainModel__ElementsAssignment");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getFieldsAssignment_3(), "rule__Entity__FieldsAssignment_3");
					put(grammarAccess.getEntityAccess().getFieldsAssignment_4_1(), "rule__Entity__FieldsAssignment_4_1");
					put(grammarAccess.getEnumFieldAccess().getNameAssignment_0(), "rule__EnumField__NameAssignment_0");
					put(grammarAccess.getEnumFieldAccess().getEnumTypeAssignment_1(), "rule__EnumField__EnumTypeAssignment_1");
					put(grammarAccess.getEnumFieldAccess().getValidatorsAssignment_2(), "rule__EnumField__ValidatorsAssignment_2");
					put(grammarAccess.getStringFieldAccess().getNameAssignment_0(), "rule__StringField__NameAssignment_0");
					put(grammarAccess.getStringFieldAccess().getValidatorsAssignment_2(), "rule__StringField__ValidatorsAssignment_2");
					put(grammarAccess.getIntegerFieldAccess().getNameAssignment_0(), "rule__IntegerField__NameAssignment_0");
					put(grammarAccess.getIntegerFieldAccess().getValidatorsAssignment_2(), "rule__IntegerField__ValidatorsAssignment_2");
					put(grammarAccess.getLongFieldAccess().getNameAssignment_0(), "rule__LongField__NameAssignment_0");
					put(grammarAccess.getLongFieldAccess().getValidatorsAssignment_2(), "rule__LongField__ValidatorsAssignment_2");
					put(grammarAccess.getBigDecimalFieldAccess().getNameAssignment_0(), "rule__BigDecimalField__NameAssignment_0");
					put(grammarAccess.getBigDecimalFieldAccess().getValidatorsAssignment_2(), "rule__BigDecimalField__ValidatorsAssignment_2");
					put(grammarAccess.getFloatFieldAccess().getNameAssignment_0(), "rule__FloatField__NameAssignment_0");
					put(grammarAccess.getFloatFieldAccess().getValidatorsAssignment_2(), "rule__FloatField__ValidatorsAssignment_2");
					put(grammarAccess.getDoubleFieldAccess().getNameAssignment_0(), "rule__DoubleField__NameAssignment_0");
					put(grammarAccess.getDoubleFieldAccess().getValidatorsAssignment_2(), "rule__DoubleField__ValidatorsAssignment_2");
					put(grammarAccess.getBooleanFieldAccess().getNameAssignment_0(), "rule__BooleanField__NameAssignment_0");
					put(grammarAccess.getBooleanFieldAccess().getValidatorsAssignment_2(), "rule__BooleanField__ValidatorsAssignment_2");
					put(grammarAccess.getLocalDateFieldAccess().getNameAssignment_0(), "rule__LocalDateField__NameAssignment_0");
					put(grammarAccess.getLocalDateFieldAccess().getValidatorsAssignment_2(), "rule__LocalDateField__ValidatorsAssignment_2");
					put(grammarAccess.getZonedDateTimeFieldAccess().getNameAssignment_0(), "rule__ZonedDateTimeField__NameAssignment_0");
					put(grammarAccess.getZonedDateTimeFieldAccess().getValidatorsAssignment_2(), "rule__ZonedDateTimeField__ValidatorsAssignment_2");
					put(grammarAccess.getBlobFieldAccess().getNameAssignment_0(), "rule__BlobField__NameAssignment_0");
					put(grammarAccess.getBlobFieldAccess().getValidatorsAssignment_2(), "rule__BlobField__ValidatorsAssignment_2");
					put(grammarAccess.getAnyBlobFieldAccess().getNameAssignment_0(), "rule__AnyBlobField__NameAssignment_0");
					put(grammarAccess.getAnyBlobFieldAccess().getValidatorsAssignment_2(), "rule__AnyBlobField__ValidatorsAssignment_2");
					put(grammarAccess.getImageBlobFieldAccess().getNameAssignment_0(), "rule__ImageBlobField__NameAssignment_0");
					put(grammarAccess.getImageBlobFieldAccess().getValidatorsAssignment_2(), "rule__ImageBlobField__ValidatorsAssignment_2");
					put(grammarAccess.getRequiredValidatorAccess().getRequiredAssignment(), "rule__RequiredValidator__RequiredAssignment");
					put(grammarAccess.getMinLengthValidatorAccess().getValueAssignment_2(), "rule__MinLengthValidator__ValueAssignment_2");
					put(grammarAccess.getMaxLengthValidatorAccess().getValueAssignment_2(), "rule__MaxLengthValidator__ValueAssignment_2");
					put(grammarAccess.getPatternValidatorAccess().getValueAssignment_2(), "rule__PatternValidator__ValueAssignment_2");
					put(grammarAccess.getMinValidatorAccess().getValueAssignment_2(), "rule__MinValidator__ValueAssignment_2");
					put(grammarAccess.getMaxValidatorAccess().getValueAssignment_2(), "rule__MaxValidator__ValueAssignment_2");
					put(grammarAccess.getMinBytesValidatorAccess().getValueAssignment_2(), "rule__MinBytesValidator__ValueAssignment_2");
					put(grammarAccess.getMaxBytesValidatorAccess().getValueAssignment_2(), "rule__MaxBytesValidator__ValueAssignment_2");
					put(grammarAccess.getStringValidatorsAccess().getRequiredAssignment_0(), "rule__StringValidators__RequiredAssignment_0");
					put(grammarAccess.getStringValidatorsAccess().getMinLengthAssignment_1(), "rule__StringValidators__MinLengthAssignment_1");
					put(grammarAccess.getStringValidatorsAccess().getMaxlengthAssignment_2(), "rule__StringValidators__MaxlengthAssignment_2");
					put(grammarAccess.getStringValidatorsAccess().getPatternAssignment_3(), "rule__StringValidators__PatternAssignment_3");
					put(grammarAccess.getNumericValidatorsAccess().getRequiredAssignment_0(), "rule__NumericValidators__RequiredAssignment_0");
					put(grammarAccess.getNumericValidatorsAccess().getMinlengthAssignment_1(), "rule__NumericValidators__MinlengthAssignment_1");
					put(grammarAccess.getNumericValidatorsAccess().getMaxlengthAssignment_2(), "rule__NumericValidators__MaxlengthAssignment_2");
					put(grammarAccess.getBlobValidatorsAccess().getRequiredAssignment_0(), "rule__BlobValidators__RequiredAssignment_0");
					put(grammarAccess.getBlobValidatorsAccess().getMinbytesAssignment_1(), "rule__BlobValidators__MinbytesAssignment_1");
					put(grammarAccess.getBlobValidatorsAccess().getMaxbytesAssignment_2(), "rule__BlobValidators__MaxbytesAssignment_2");
					put(grammarAccess.getRelationshipsAccess().getCardinalityAssignment_1(), "rule__Relationships__CardinalityAssignment_1");
					put(grammarAccess.getRelationshipsAccess().getRelationshipsAssignment_3(), "rule__Relationships__RelationshipsAssignment_3");
					put(grammarAccess.getRelationshipAccess().getFromEntityAssignment_0(), "rule__Relationship__FromEntityAssignment_0");
					put(grammarAccess.getRelationshipAccess().getFromNameAssignment_1(), "rule__Relationship__FromNameAssignment_1");
					put(grammarAccess.getRelationshipAccess().getToEntityAssignment_3(), "rule__Relationship__ToEntityAssignment_3");
					put(grammarAccess.getRelationshipAccess().getToNameAssignment_4(), "rule__Relationship__ToNameAssignment_4");
					put(grammarAccess.getRelationshipNameAccess().getNameAssignment_1(), "rule__RelationshipName__NameAssignment_1");
					put(grammarAccess.getEnumTypeAccess().getNameAssignment_1(), "rule__EnumType__NameAssignment_1");
					put(grammarAccess.getEnumTypeAccess().getValuesAssignment_3(), "rule__EnumType__ValuesAssignment_3");
					put(grammarAccess.getEnumTypeAccess().getValuesAssignment_4_1(), "rule__EnumType__ValuesAssignment_4_1");
					put(grammarAccess.getServiceGenerationSettingAccess().getEntitiesAssignment_1(), "rule__ServiceGenerationSetting__EntitiesAssignment_1");
					put(grammarAccess.getServiceGenerationSettingAccess().getEntitiesAssignment_2_1(), "rule__ServiceGenerationSetting__EntitiesAssignment_2_1");
					put(grammarAccess.getServiceGenerationSettingAccess().getServiceTypeAssignment_4(), "rule__ServiceGenerationSetting__ServiceTypeAssignment_4");
					put(grammarAccess.getDTOGenerationSettingAccess().getEntitiesAssignment_1(), "rule__DTOGenerationSetting__EntitiesAssignment_1");
					put(grammarAccess.getDTOGenerationSettingAccess().getEntitiesAssignment_2_1(), "rule__DTOGenerationSetting__EntitiesAssignment_2_1");
					put(grammarAccess.getDTOGenerationSettingAccess().getDtoTypeAssignment_4(), "rule__DTOGenerationSetting__DtoTypeAssignment_4");
					put(grammarAccess.getPaginateGenerationSettingAccess().getEntitiesAssignment_1(), "rule__PaginateGenerationSetting__EntitiesAssignment_1");
					put(grammarAccess.getPaginateGenerationSettingAccess().getEntitiesAssignment_2_1(), "rule__PaginateGenerationSetting__EntitiesAssignment_2_1");
					put(grammarAccess.getPaginateGenerationSettingAccess().getPaginateTypeAssignment_4(), "rule__PaginateGenerationSetting__PaginateTypeAssignment_4");
					put(grammarAccess.getAngularSuffixGenerationSettingAccess().getEntitiesAssignment_1(), "rule__AngularSuffixGenerationSetting__EntitiesAssignment_1");
					put(grammarAccess.getAngularSuffixGenerationSettingAccess().getEntitiesAssignment_2_1(), "rule__AngularSuffixGenerationSetting__EntitiesAssignment_2_1");
					put(grammarAccess.getAngularSuffixGenerationSettingAccess().getIdAssignment_4(), "rule__AngularSuffixGenerationSetting__IdAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalJDLParser typedParser = (InternalJDLParser) parser;
			typedParser.entryRuleDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
