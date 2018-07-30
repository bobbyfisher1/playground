package org.example.eis.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.example.eis.eis.EisPackage

class EisIndex {
	@Inject ResourceDescriptionsProvider rdp

	def getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.URI)
	}

	def getExportedEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjects
	}

	def getExportedVariablesEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjectsByType(EisPackage.eINSTANCE.variable)
	}

}
