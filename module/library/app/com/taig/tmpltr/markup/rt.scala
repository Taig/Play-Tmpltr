package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	rt[A <: rt[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "rt", attributes, content )