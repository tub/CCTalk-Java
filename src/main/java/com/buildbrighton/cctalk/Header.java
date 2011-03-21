package com.buildbrighton.cctalk;

public enum Header {
	FactorySetUpAndTest(255),
	SimplePoll(254),
	AddressPoll(253),
	AddressClash(252),
	AddressChange(251),
	AddressRandom(250),
	RequestPollingPriority(249),
	RequestStatus(248),
	RequestVariableSet(247),
	RequestManufacturerId(246),
	RequestEquipmentCategoryId(245),
	RequestProductCode(244),
	RequestDatabaseVersion(243),
	RequestSerialNumber(242),
	RequestSoftwareRevision(241),
	TestSolenoids(240),
	OperateMotors(239),
	TestOutputLines(238),
	ReadInputLines(237),
	ReadOptoStates(236),
	ReadLastCreditOrErrorCode(235),
	IssueGuardCode(234),
	LatchOutputLines(233),
	PerformSelfCheck(232),
	ModifyInhibitStatus(231),
	RequestInhibitStatus(230),
	ReadBufferedCreditOrErrorCodes(229),
	ModifyMasterInhibitStatus(228),
	RequestMasterInhibitStatus(227),
	RequestInsertionCounter(226),
	RequestAcceptCounter(225),
	DispenseCoins(224),
	DispenseChange(223),
	ModifySorterOverrideStatus(222),
	RequestSorterOverrideStatus(221),
	OneShotCredit(220),
	EnterNewPinNumber(219),
	EnterPinNumber(218),
	RequestPayoutHighLowStatus(217),
	RequestDataStorageAvailability(216),
	ReadDataBlock(215),
	WriteDataBlock(214),
	RequestOptionFlags(213),
	RequestCoinPosition(212),
	PowerManagementControl(211),
	ModifySorterPaths(210),
	RequestSorterPaths(209),
	ModifyPayoutAbsoluteCount(208),
	RequestPayoutAbsoluteCount(207),
	EmptyPayout(206),
	RequestAuditInformationBlock(205),
	MeterControl(204),
	DisplayControl(203),
	TeachModeControl(202),
	RequestTeachStatus(201),
	UploadCoinData(200),
	ConfigurationToEeprom(199),
	CountersToEeprom(198),
	CalculateRomChecksum(197),
	RequestCreationDate(196),
	RequestLastModificationDate(195),
	RequestRejectCounter(194),
	RequestFraudCounter(193),
	RequestBuildCode(192),
	KeypadControl(191),
	RequestPayoutStatus(190),
	ModifyDefaultSorterPath(189),
	RequestDefaultSorterPath(188),
	ModifyPayoutCapacity(187),
	RequestPayoutCapacity(186),
	ModifyCoinId(185),
	RequestCoinId(184),
	UploadWindowData(183),
	DownloadCalibrationInfo(182),
	ModifySecuritySetting(181),
	RequestSecuritySetting(180),
	ModifyBankSelect(179),
	RequestBankSelect(178),
	HandheldFunction(177),
	RequestAlarmCounter(176),
	ModifyPayoutFloat(175),
	RequestPayoutFloat(174),
	RequestThermistorReading(173),
	EmergencyStop(172),
	RequestHopperCoin(171),
	RequestBaseYear(170),
	RequestAddressMode(169),
	RequestHopperDispenseCount(168),
	DispenseHopperCoins(167),
	RequestHopperStatus(166),
	ModifyVariableSet(165),
	EnableHopper(164),
	TestHopper(163),
	ModifyInhibitAndOverrideregisters(162),
	PumpRng(161),
	RequestCipherKey(160),
	ReadBufferedBillEvents(159),
	ModifyBillId(158),
	RequestBillId(157),
	RequestCountryScalingFactor(156),
	RequestBillPosition(155),
	RouteBill(154),
	ModifyBillOperatingMode(153),
	RequestBillOperatingMode(152),
	TestLamps(151),
	RequestIndividualAcceptCounter(150),
	RequestIndividualErrorCounter(149),
	ReadOptoVoltages(148),
	PerformStackerCycle(147),
	OperateBiDirectionalMotors(146),
	RequestCurrencyRevision(145),
	UploadBillTables(144),
	BeginBillTableUpgrade(143),
	FinishBillTableUpgrade(142),
	RequestFirmwareUpgradeCapability(141),
	UploadFirmware(140),
	BeginFirmwareUpgrade(139),
	FinishFirmwareUpgrade(138),
	SwitchEncryptionCode(137),
	StoreEncryptionCode(136),
	SetAcceptLimit(135),
	DispenseHopperValue(134),
	RequestHopperPollingValue(133),
	EmergencyStopValue(132),
	RequestHopperCoinValue(131),
	RequestIndexedHopperDispenseCount(130),
	ReadBarcodeData(129),
	RequestMoneyIn(128),
	RequestMoneyOut(127),
	ClearMoneyCounters(126),
	PayMoneyOut(125),
	VerifyMoneyOut(124),
	RequestActivityRegister(123),
	RequestErrorStatus(122),
	PurgeHopper(121),
	ModifyHopperBalance(120),
	RequestHopperBalance(119),
	ModifyCashboxValue(118),
	RequestCashboxValue(117),
	ModifyRealTimeClock(116),
	RequestRealTimeClock(115),
	RequestUsbId(114),
	SwitchBaudRate(113),
	ReadEncryptedEvents(112),
	RequestEncryptionSupport(111),
	SwitchEncryptionKey(110),
	RequestEncryptedHopperStatus(109),
	RequestEncryptedMonetaryId(108),
	ExpansionHeader4(103),
	ExpansionHeader3(102),
	ExpansionHeader2(101),
	ExpansionHeader1(100),
	BusyMessage(006),
	NakMessage(005),
	RequestCommsRevision(004),
	ClearCommsStatusVariables(003),
	RequestCommsStatusVariables(002),
	ResetDevice(001),
	ReturnMessage(000);
	
	private byte value;
	
	Header(int value){
		this.value = (byte) (0xff & value);
	}
	
	public byte getValue(){
		return value;
	}
	
	/**
	 * returns the current value byte as a binary string.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.name());
		sb.append('(');
		byte valCopy = value;
	     for (int i = 0; i < 8; i++)
	     {
	        sb.append((valCopy & 128) == 0 ? 0 : 1);
	        valCopy <<= 1;
	     }
	     sb.append(')');
	     return sb.toString();
	}
	
	public static Header valueOf(byte b){
		for(Header h : Header.values()){
			if(h.value == b){
				return h;
			}
		}
		return null;
	}
}
