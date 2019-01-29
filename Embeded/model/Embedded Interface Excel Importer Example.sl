com.conformiq.creator.structure.v15

creator.externalinterface qmlBodyControlModule45RightDoor91out93 "Body Control Module - Right Door [out]"
direction = out;

creator.customaction qmlEmbExcelImportDoorOutputSignalRightdoorout "Door  Output Signal Right door"
	interfaces = [ qmlBodyControlModule45RightDoor91out93 ]
	shortform = "VA"
	icon = "model/square waveform.png"
	direction = out
	tokens = [ literal "Validate Output Signal : Door  Port : Right door<@checkDontCare value=action.customAction; val>
<@checkDontCare value=getField(val, \"Status\").value alt=\"\" ; val>  Status \"${val}\"${br}</@checkDontCare><#rt>
<@checkDontCare value=getField(val, Id).value alt=\"\" ; val>  Id ${val}${br}</@checkDontCare><#rt>
</@checkDontCare>"]

{
	creator.primitivefield Right32doorEmbExcelImportDoor3232Field32Name321Statusout "Status"
	type = String;

	creator.primitivefield Right32doorEmbExcelImportDoor3232Field32Name322Idout "Id"
	type = number;

}
creator.customaction qmlEmbExcelImportWindowInputSignalBackdoorIn "Window Input Signal Back door"
	interfaces = [ qmlBodyControlModule45BackDoor91in93 ]
	shortform = "IA"
	icon = "model/square waveform.png"
	direction = in
	tokens = [ literal "Input Signal : Window Port : Back door<@checkDontCare value=action.customAction; val>for
<@checkDontCare value=getField(val, \"s\").value alt=\"\" ; val>  s \"${val}\"${br}</@checkDontCare><#rt>
<@checkDontCare value=getField(val, b).value alt=\"\" ; val>  b ${val}${br}</@checkDontCare><#rt>
<@checkDontCare value=getField(val, \"Status\").value alt=\"\" ; val>  Status \"${val}\"${br}</@checkDontCare><#rt>
</@checkDontCare>"]

{
	creator.primitivefield Back32doorEmbExcelImportWindow32Field32Name321sin "s"
	type = String;

	creator.primitivefield Back32doorEmbExcelImportWindow32Field32Name322bin "b"
	type = boolean;

	creator.primitivefield Back32doorEmbExcelImportWindow32Field32Name323Statusin "Status"
	type = String;

}
creator.externalinterface qmlBodyControlModule45BackDoor91in93 "Body Control Module - Back Door [in]"
direction = in;

creator.sequencetype qmld39e9f5009454739badebc18ec24fa04 "unnamed"
	deleted
{
}
creator.customaction qml1b3fc0c70b5e4db489a477bba93a2d0e
"Door  Output Signal Right door (1)"
	interfaces = [ qmlBodyControlModule45RightDoor91out93 ]
	shortform = "VA"
	icon = "model/square waveform.png"
	direction = out
	tokens = [ literal
"Validate Output Signal : Door  Port : Right door<@checkDontCare value=action.customAction; val>\r\n<@checkDontCare value=getField(val, \"Status\").value alt=\"\" ; val>  Status \"${val}\"${br}</@checkDontCare><#rt>\r\n<@checkDontCare value=getField(val, Id).value alt=\"\" ; val>  Id ${val}${br}</@checkDontCare><#rt>\r\n</@checkDontCare>"
]
{
	creator.primitivefield qmlbf1864def5ce4bdf9e2a0005a7f214ad "Status"
		type = String;
	creator.primitivefield qml2000dec119e446e8894cb4671fa6b1bc "Id"
		type = number;
}