package events

/**
 * Created by Felipe on 24/06/2015.
 */
object EventType extends Enumeration  {
  type EventType = Value
  val SteelSheetCreated,
  TransportWorkerIdle,
  TransportWorkerActive,
  CNCOperatorIdle,
  CutSectorAncillaryIdle,
  CNCCutMachineIdle,
  FitterIdle,
  WelderIdle,
  CNCOperatorActive,
  CutSectorAncillaryActive,
  CNCCutMachineActive,
  FitterActive,
  WelderActive = Value
}