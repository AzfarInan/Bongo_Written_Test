OnPress: Click =>

	if (video.state == pause)
		video.state = play
	
	else if (video.state == play)
		video.state = pause

	else if (video.state == null || video.state == stop)
		video.currentTime = 0
		video.state = play


OnPress: Forward =>
	if (video.state != stop)
		if (video.remainingTime > 10 && video.currentTime != 0)
			video.currentTime += 10
		else if (video.remainingTime <= 10)
			video.remainingTime = 0
			video.state = stop
		if (video.state == null)
			video.state = play
			
OnPress: Rewind =>
	if (video.state != stop || vidoe.state != null)
		if (video.currentTime > 10 && video.remainingTime != 0)
			video.currentTime -= 10
		else if (video.currentTime <= 10)
			video.currentTIme = 0
	