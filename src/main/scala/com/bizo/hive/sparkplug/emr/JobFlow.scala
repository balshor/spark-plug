package com.bizo.hive.sparkplug.emr

case class JobFlow(
  name: String,
  cluster: RunnableCluster,
  steps: Seq[JobStep],
  bootstrap: Seq[BootstrapAction] = Seq.empty,
  keepAlive: Boolean = false
) {
  
  def withBootstrapAction(actions: Seq[BootstrapAction]) = {
    copy(bootstrap = actions)
  }
  
  def withKeepAlive(keepAlive: Boolean) = {
    copy(keepAlive = keepAlive)
  }
}
